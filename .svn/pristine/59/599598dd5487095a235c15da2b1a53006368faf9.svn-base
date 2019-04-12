package com.ideepmind.joy.sdk;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.ideepmind.joy.sdk.chat.ChatRecord;
import com.ideepmind.joy.sdk.chat.ChatRecordResult;
import com.ideepmind.joy.sdk.cookbook.CookBookTase;
import com.ideepmind.joy.sdk.cookbook.CookSearchCondition;
import com.ideepmind.joy.sdk.cookbook.CookbookDetailResult;
import com.ideepmind.joy.sdk.cookbook.CookbookPageResult;
import com.ideepmind.joy.sdk.cookbook.FoodIntroResult;
import com.ideepmind.joy.sdk.cookbook.FoodPageResult;
import com.ideepmind.joy.sdk.cookbook.MaterialsOfFoodResult;
import com.ideepmind.joy.sdk.cookbook.RecommendComboResult;
import com.ideepmind.joy.sdk.cookbook.RecommendFamilyResult;
import com.ideepmind.joy.sdk.cookbook.SimpleCook;
import com.ideepmind.joy.sdk.cookbook.SimpleCook2;
import com.ideepmind.joy.sdk.cookbook.SimpleFood;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryDetailResult;
import com.ideepmind.joy.sdk.diet.CategoryPageResult;
import com.ideepmind.joy.sdk.diet.CategoryType;
import com.ideepmind.joy.sdk.diet.HealthDataResult;
import com.ideepmind.joy.sdk.diet.HomePageResult;
import com.ideepmind.joy.sdk.loading.LoadingPage;
import com.ideepmind.joy.sdk.loading.LoadingResourceResult;
import com.ideepmind.joy.sdk.qa.QAResult;
import com.ideepmind.joy.sdk.user.AllMemberDataResult;
import com.ideepmind.joy.sdk.user.BFRResult;
import com.ideepmind.joy.sdk.user.ListUserResult;
import com.ideepmind.joy.sdk.user.UserData;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class JoyHttpService {
	private static JoyHttpService intance;
	static {
		intance = new JoyHttpService();
	}
	public static JoyHttpService getIntance() {
		return intance;
	}
	
	private OkHttpClient client;
	private String baseUrl;
	private String sessionKey;
	
	private LoginUser loginUser;
	
	private static final class OsUtils
	{
	   private static String OS = null;
	   public static String getOsName()
	   {
	      if(OS == null) { OS = System.getProperty("os.name"); }
	      return OS;
	   }
	   public static boolean isWindows()
	   {
	      return getOsName().startsWith("Windows");
	   }

	}

	private JoyHttpService() {
		if (OsUtils.isWindows()) {
			client = new Builder().readTimeout(300, TimeUnit.SECONDS).build();
		} else {
			client = new OkHttpClient();
		}
	}
	
	/** 获取OkHttpClient
	 * @return OkHttpClient
	 */
	public OkHttpClient getClient() {
		return client;
	}

	/** 设置OkHttpClient
	 * @param client OkHttpClient
	 */
	public void setClient(OkHttpClient client) {
		this.client = client;
	}

	/**
	 * @return the sessionKey
	 */
	public String getSessionKey() {
		return sessionKey;
	}


	/**
	 * @return the loginUser
	 */
	public LoginUser getLoginUser() {
		return loginUser;
	}


	/**
	 * 服务端调用的方法，客户端不需要使用
	 * @param clazz
	 * @param serviceName
	 * @param methodName
	 * @param args
	 * @return
	 */
	public <T extends IServiceResult> T invoke(Class<T> clazz, String serviceName, String methodName, Object... args) {
		String url = makeUrl("/rmi/invoke");
		RMIParam param = new RMIParam(serviceName, methodName, args);
		Request request = new Request.Builder().url(url).post(RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), 
				JSONObject.toJSONString(param))).build();
		try {
			Response response = client.newCall(request).execute();
			System.out.println(url);
			if (response.isSuccessful() && response.code() == 200) {
				 String result = response.body().string();
                 return JSONObject.parseObject(result, clazz);
			} else {
				T r = clazz.newInstance();
				r.setCode(ErrorCode.HTTP_ERROR);
				r.setMessage("服务器错误:" + response.body().string());
				return r;
			}
		} catch (Exception e) {
		    e.printStackTrace();
			T r = null;
			try {
				r = clazz.newInstance();
			} catch (InstantiationException | IllegalAccessException e1) {
				e1.printStackTrace();
			}
			if (e instanceof IOException) {
				r.setCode(ErrorCode.NETWORK_ERROR);
			} else if (e instanceof JSONException) {
				r.setCode(ErrorCode.JSON_ERROR);
			} else {
				r.setCode(ErrorCode.UNKNOWN_ERROR);
			}
			r.setMessage(exceptionString(e));
			return r;
		}
	} 
	
	private String exceptionString(Exception e) {
		StringWriter sw = new StringWriter();  
        PrintWriter pw = new PrintWriter(sw);  
        e.printStackTrace(pw);
		return sw.toString();
	}
	private static class QAResultData extends ServiceResult<QAResult> {
		
	}
	
	/**
	 * 客户端语音调用接口
	 * @param question 用户说的话
	 * @param moduleName 当前所在的功能模块
	 * @return QAResult
	 */
	public QAResult ask(String question, String moduleName) {
		QAResultData r = invoke(QAResultData.class, "ChatService", "ask", question, moduleName);
		QAResult ret = r.success()? r.getResult() : new QAResult();
		ret.setErroCode(r.getCode());
		ret.setErroMessage(r.getMessage());
		ret.setDetail(r.getDetail());
		return ret;
	}
	
	/**
	 * 拼接请求的Url
	 * @param path
	 * @param args
	 * @return
	 */
	public String makeUrl(String path, String... args) {
		StringBuilder sb = new StringBuilder();
		sb.append(baseUrl);
		sb.append(path);
		boolean hasParam = false;
		for (int i = 0; i < args.length; i += 2) {
			if (args[i+1] == null || args[i+1].length() == 0){
				continue;
			}
			if (!hasParam) {
				sb.append("?");
				hasParam = true;
			} else {
				sb.append("&");
			}
			sb.append(args[i]);
			sb.append("=");
			
			try {
				sb.append(URLEncoder.encode(args[i+1], "utf-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (sessionKey != null) {
			if (!hasParam) {
				sb.append("?");
				hasParam = true;
			} else {
				sb.append("&");
			}
			sb.append("session_key=");
			sb.append(sessionKey);
		}
		return sb.toString();
	}
	
	@Deprecated
	public String request(String path, String... args) throws IOException {
		String url = makeUrl(path, args);
		Request request = new Request.Builder().url(url).build();
		
		Response response = client.newCall(request).execute();
		return response.body().string();
	}

	@Deprecated
	public <T extends IServiceResult> T request(String path, Class<T> clazz, String... args) {
		String url = makeUrl(path, args);
		Request request = new Request.Builder().url(url).build();
		try {
			Response response = client.newCall(request).execute();
//			System.out.println(url);
			if (response.isSuccessful() && response.code() == 200) {
				 String result = response.body().string();
                 return JSONObject.parseObject(result, clazz);
			} else {
				T r = clazz.newInstance();
				r.setCode(100);
				r.setMessage("服务器错误");
				return r;
			}
		} catch (Exception e) {
			T r = null;
			try {
				r = clazz.newInstance();
			} catch (InstantiationException | IllegalAccessException e1) {
				e1.printStackTrace();
			}
			r.setCode(-1);
			r.setMessage("服务器调用异常：" + e.getMessage());
			return r;
		}
	}
	
	/** 登录系统，使用账号和密码等信息
	 * @param param 传递给九阳智能家电APP后台接口的登录login参数串
	 * @param devCode 设备号
	 * @return LoginUser
	 */
	public LoginUserResult login(String param, String devCode) {
		LoginUserResult ret = invoke(LoginUserResult.class, "UserService", "login", param, devCode);
		return updateSession(ret);
	}


	/**
	 * @param r
	 */
	private LoginUserResult updateSession(LoginUserResult r) {
		if (r.success()) {
			this.sessionKey = r.getResult().getSessionKey();
			this.loginUser = r.getResult();
		}
		return r;
	}
	
	/** 登录系统，使用临时帐号
	 * @param sessionKey 传递给九阳智能家电APP后台接口的regTempUser参数串
	 * @param devCode 设备号
	 * @return LoginUser
	 */
	public LoginUserResult loginTemp(String param, String devCode) {
		LoginUserResult ret = invoke(LoginUserResult.class, "UserService", "loginTemp", param, devCode);
		return updateSession(ret);
	}
	
	/** 登录系统，使用历史保存sessionkey
	 * @param sessionKey 传递给九阳智能家电APP后台接口的sessionKey
	 * @param devCode 设备号
	 * @return LoginUser
	 */
	public LoginUserResult tryLogin(String sessionKey, String devCode) {
		LoginUserResult ret = invoke(LoginUserResult.class, "UserService", "tryLogin", sessionKey, devCode);
		return updateSession(ret);
	}
	
	/**
	 * 注销，退出系统
	 */
	public void logout() {
		closeSession();
	}
	
	
	
	/** 保存家庭成员
	 * @param userData
	 */
	public BooleanResult saveMember(UserData userData) {
		return invoke(BooleanResult.class, "UserService", "saveOrUpdate", userData);
	}
	
	/** 删除家庭成员
	 * @param userData
	 */
	public BooleanResult deleteMember(UserData userData) {
		return invoke(BooleanResult.class, "UserService", "delete", userData);
	}
	/**
	 * 根据年龄和体重计算出体重是偏轻，偏重还是正常
	 * @param gender 代表男女，1：男，0：女
	 * @param monthAge 代表0~7岁孩子的具体的月龄
	 * @param weight 代表0~7岁孩子的体重
	 * @return "偏轻"，"偏重"，"正常"
	 */
	public BFRResult caculateBodyFat(int gender, int monthAge, float weight,float height) {
		return invoke(BFRResult.class, "UserService", "caculateBodyFat", gender, monthAge, weight,height);
	}
	/** 获取用户头像
	 * @param userId 用户ID
	 * @return
	 * @throws IOException
	 */
	public UserHeadImageResult getAvatar(String userId) {
		return invoke(UserHeadImageResult.class, "UserService", "getAvatar", userId);
	}
	
	/** 删除头像
	 * @param userId
	 * @return 是否成功
	 */
	public BooleanResult deleteAvatar(String userId) {
		return invoke(BooleanResult.class, "UserService", "deleteAvatar", userId);
	}
	
	/** 保存头像
	 * @param userId 用户ID
	 * @param image 文件
	 * @return 是否成功
	 * @throws IOException 
	 */
	public BooleanResult saveAvatar(String userId, File image) throws IOException {
		UserHeadImage data = new UserHeadImage();
		data.setUserId(userId);
		data.setImageData(readData(image));
		return invoke(BooleanResult.class, "UserService", "saveAvatar", data);
	}
	
	private byte[] readData(File file) throws IOException {
//		return Files.readAllBytes(image.toPath());
		int size = (int) file.length();
		byte[] bytes = new byte[size];
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream(file));		
		try {
			buf.read(bytes, 0, bytes.length);
		} finally {
			buf.close();
		}
		return bytes;
	}

	/** 获取所有家庭成员
	 * @return 所有家庭成员
	 */
	public ListUserResult getAllUserData() {		
		return invoke(ListUserResult.class, "UserService", "getAllUserData");
	}
	
	/** 获取所有成员数据和基础数据字典
	 * @return 
	 */
	public AllMemberDataResult getAllMemberData() {		
		return invoke(AllMemberDataResult.class, "UserService", "getAllMemberData");
	}
	
	/** 根据经纬度获取城市信息
	 * @param location WGS84坐标，格式为“纬度,经度”，如：40.046548726921589,116.31596612695755
	 * @return
	 */
	public StringResult city(String location) {
		return invoke(StringResult.class, "ChatService", "city", location);
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		if (baseUrl == null) {
			throw new NullPointerException("baseUrl");
		}
		if (baseUrl.endsWith("/")) {
			this.baseUrl = baseUrl.substring(0, baseUrl.length()-1);
		} else {
			this.baseUrl = baseUrl;
		}
	}
	public LoginUserResult openSession(String userId, String devCode) {
		LoginUserResult ret = invoke(LoginUserResult.class, "UserService", "openSession", userId, devCode);
		return updateSession(ret);
	}
	
	public LoginUserResult openSession(String sessionKey) {
		LoginUserResult ret = invoke(LoginUserResult.class, "UserService", "createSession", sessionKey);
		return updateSession(ret);
	}
	
	public BooleanResult closeSession() {
		BooleanResult r = invoke(BooleanResult.class, "UserService", "closeSession");
		if (r.success()) {
			this.loginUser = null;
			this.sessionKey = null;
		}
		return r;
	}
	
	/** 获取某个筛选/推荐条件类别(功效，口味，人群)的详情
	 * @param c 具体某个筛选/推荐条件
	 * @return CategoryDetail 筛选条件的详细信息
	 */
	public CategoryDetailResult getCategoryDetail(Category c) {
		return invoke(CategoryDetailResult.class, "CookService", "categoryDetail", c);
	}
	
	/** 根据筛选推荐条件类别（功效，口味，人群）获取筛选条件下的数据集合
	 * @param type 筛选推荐条件类型（功效，口味，人群）
	 * @return CategoryPage
	 */
	public CategoryPageResult findItemsOfCategory(CategoryType type) {
		return findItemsOfCategory(type, 0, 0);
	}
	
	/** 根据筛选推荐条件类型（功效，口味，人群）获取筛选条件下的数据集合
	 * @param type 筛选推荐条件类型（功效，口味，人群）
	 * @param pageIndex 页号
	 * @param pageSize 页大小
	 * @return CategoryPage
	 */
	public CategoryPageResult findItemsOfCategory(CategoryType type, int pageIndex, int pageSize) {
		return invoke(CategoryPageResult.class, "CookService", "getNamesPage", type, pageIndex, pageSize);
	}
	/** 获取饮食首页数据
	 * @return HomePage
	 */
	public HomePageResult getDietDataOfHome() {
		return invoke(HomePageResult.class, "CookService", "dietHome");
	}
	
	/** 获取食材介绍(食材之食谱页面中的食材信息)
	 * @param foodName 食材名称
	 * @return FoodIntro
	 */
	@Deprecated
	public FoodIntroResult getFoodMaterialIntro(String foodName) {
		return invoke(FoodIntroResult.class, "CookService", "foodIntro", foodName);
	}
	
	/** 获取食材详情
	 * @param foodName 食材名称
	 * @return FoodDetail
	 */
	public FoodIntroResult getFoodMaterialDetail(String foodName) {
		return invoke(FoodIntroResult.class, "CookService", "foodDetail", foodName);
	}
	
	/** 根据某个筛选条件查询菜谱
	 * @param category 筛选条件(时令食材，功效，口味，人群)
	 * @param pageIndex 页号，从1开始计数
	 * @param pageSize 页大小
	 * @return CookbookPage
	 */
	public CookbookPageResult findCookbook(Category category, int pageIndex, int pageSize) {
		return findCookbook(new Category[]{category}, pageIndex, pageSize);
	}
	
	/** 根据多个筛选条件查询菜谱
	 * @param categoryArr 筛选条件(时令食材，功效，口味，人群)
	 * @param pageIndex 页号，从1开始计数
	 * @param pageSize 页大小
	 * @return CookbookPage
	 */	
	public CookbookPageResult findCookbook(Category[] categoryArr, int pageIndex, int pageSize) {
		return invoke(CookbookPageResult.class, "CookService", "findCookbook", categoryArr, pageIndex, pageSize);
	}
	
	/** 根据某个季节查询食材
	 * @param season 春、夏、秋、冬
	 * @param pageIndex 页号，从1开始计数
	 * @param pageSize 页大小
	 * @return FoodPage
	 */
	public FoodPageResult findFoodMaterials(String season, int pageIndex, int pageSize) {
		return findFoodMaterials(Category.build(CategoryType.Season, season), pageIndex, pageSize);
	}
	
	/** 根据某个筛选条件查询食材
	 * @param category 筛选条件(功效，口味，人群)
	 * @param pageIndex 页号，从1开始计数
	 * @param pageSize 页大小
	 * @return FoodPage
	 */
	public FoodPageResult findFoodMaterials(Category category, int pageIndex, int pageSize) {
		return findFoodMaterials(new Category[]{category}, pageIndex, pageSize);
	}
	
	/** 根据多种筛选条件查询食材
	 * @param categoryArr 筛选条件(功效，口味，人群)
	 * @param pageIndex 页号，从1开始计数
	 * @param pageSize 页大小
	 * @return FoodPage
	 */	
	public FoodPageResult findFoodMaterials(Category[] categoryArr, int pageIndex, int pageSize) {
		return invoke(FoodPageResult.class, "CookService", "findFoods", categoryArr, pageIndex, pageSize);
	}
	
	/** 今日推荐食谱-家庭或个人（根据用户保存信息判断）
	 * @return RecommendFamily
	 */
	public RecommendFamilyResult recommendFamilyCookbook() {
		return invoke(RecommendFamilyResult.class, "CookService", "recommendFamily");
	}
	
	/** 今日推荐食谱-套餐组合
	 * @param count 人数
	 * @return RecommendPage
	 */
	public RecommendComboResult recommendCombinatorialCookbook(CookSearchCondition cond) {
		return invoke(RecommendComboResult.class, "CookService", "recommendCombo", cond);
	}
	/** 待机状态食谱推荐
	 * @param 
	 * @return RecommendPage
	 */
	public RecommendComboResult standyCookbook() {
		return invoke(RecommendComboResult.class, "CookService", "standyCookbook");
	}
	/** 返回食谱详情
	 * @param CookbookId 食谱编号
	 * @return CookbookDetail
	 */
	public CookbookDetailResult findCookbookDetail(String CookbookId) {
		return invoke(CookbookDetailResult.class, "CookService", "findCookbookDetail", CookbookId);
	}
	
	/**
	 * 根据关键字搜索食材名称列表，食材中包含关键字的将被搜索出来
	 * @param word 为搜索关键字
	 * @return 返回食材数据为MaterailOfFood的list，对象中将包含食材ID和食材名称
	 */
	public MaterialsOfFoodResult GetMaterailsOfFood(String word)
	{
		return invoke(MaterialsOfFoodResult.class, "CookService", "GetMaterialsOfFood", word);
	}
	
	/** 根据queryId查询分页数据
	 * @param pageIndex
	 * @param pageSize
	 * @param queryIds
	 * @return
	 */
	public QueryPageListResult queryPages(int pageIndex, int pageSize, String... queryIds) {
		return invoke(QueryPageListResult.class, "QueryService", "queryPages", pageIndex, pageSize, queryIds);
	}
	
	/** 根据queryId查询分页数据
	 * @param pageIndex
	 * @param pageSize
	 * @param queryIds
	 * @return
	 */
	public QueryPageListResult queryPagesByIds(int pageIndex, int pageSize, String[] queryIds) {
		return invoke(QueryPageListResult.class, "QueryService", "queryPages", pageIndex, pageSize, queryIds);
	}
	
	/**
	 * 根据用户查询聊天记录
	 * @param module  模块名字
	 * @param page		页数
	 * @param pagesize  每页显示多少条
	 * @param userId    设备唯一id
	 * @return
	 */
	
	public ChatRecordResult queryChatRecord(String module,int page,int pagesize,String userId){
		return invoke(ChatRecordResult.class, "QueryService", "queryChatPages",module,page,pagesize,userId);
	}
	/**
	 * 保存触摸问答记录
	 * @param cr
	 * @return
	 */
	public ChatRecordResult saveTouchRecord(ChatRecord cr){
		return invoke(ChatRecordResult.class, "QueryService", "saveTouchRecord",cr);
	}
	
	/**
	 * 提供健康咨询的数据
	 * @return HealthDataResult
	 */
	public HealthDataResult getRecommondDataOfHC(){
		
		return invoke(HealthDataResult.class, "QueryService", "getRecommondDataOfHC");
	}
	
	
	public StringResult rotation(String contactId, String command) {
		return invoke(StringResult.class, "RemoteControlService", "rotation", contactId, command);
	}
	
	/**
	 * 更新资源接口
	 * @param categoryArr
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
//	public LoadingResourceResult findLoadingResource() {
//		return invoke(LoadingResourceResult.class, "LoadingService", "findLoadingResource");
//	}
	
	/** 获取食材详细信息
	 * @param foodName，当name加上2的时候，会获取少量的信息
	 * @return
	 */
	private SimpleFood getfFoodMaterialDetail(String foodName,String userId) {
		return request("/cookbook/food",SimpleFood.class,"name",foodName,"auth_id",userId);
	}
	/**
	 * 当season是春夏秋冬，当season 是firstPageData的时候，是获取首页。allFoodTase的时候是获取所有食材食谱特性
	 * @param 
	 * @param page从第一页开始
	 * @return
	 */
	private CookBookTase foodSome(String season,String page,String isFirst,String auth_id) {
		return request("/cookbook/cookbookTase",CookBookTase.class,"season",season,"page",page,"isFirst","","auth_id",auth_id);
	}
	/**
	 * 根据节日获取食谱。
	 * @param festival
	 * @param page
	 * @param auth_id
	 * @return  SimpleCook
	 */
	
	private SimpleCook cookByFestival(String festival,String page,String auth_id){
		return request("/cookbook/cookbookFestival",SimpleCook.class,"festival",festival,"page",page,"auth_id",auth_id);
	}
	
	/**
	 * 
	 * @param all  根据食谱特性，人群，口味等都可以搜出食谱
	 * @param page
	 * @param auth_id
	 * @return
	 */
	private SimpleCook2 cookByAll(String all,String page,String auth_id){
		return request("/cookbook/cookbookAll",SimpleCook2.class,"all",all,"page",page,"auth_id",auth_id);
	}
	
	/**
	 *  获取首页随机三个菜谱，每次不同。除非个数比较少
	 * @param question 
	 * @param auth_id
	 * @return
	 */
	private SimpleCook cookbook(String question,String auth_id){
		return request("/cookbook/cookbook",SimpleCook.class,"question",question,"auth_id",auth_id);
	}
	public LoadingResourceResult findLoadingResource(){
		return request("/loading/loading",LoadingResourceResult.class);
	}
	/**
	 * 标识人脸识别是否成功
	 * @return
	 */
	
	public BooleanResult faceSuccess() {
		return invoke(BooleanResult.class, "ChatService", "faceSuccess");
	}
}
