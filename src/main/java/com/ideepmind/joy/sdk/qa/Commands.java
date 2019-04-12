package com.ideepmind.joy.sdk.qa;

public final class Commands {
	/**
	 * 跳过
	 */
	public static final String Skip = "Skip";
	
	/**
	 * 人脸录入
	 */
	public static final String FaceInput = "FaceInput";
		
	
	/**
	 * 人脸识别
	 */
	public static final String FaceDetection = "FaceDetection";
	/**
	 * 家庭信息录入
	 */
	public static final String PersonAdd = "PersonAdd";
	/**
	 * 修改个人信息
	 */
	
	public static final String PersonModify = "PersonModify";
	
	/**
	 * 修改增强信息
	 */
	
	public static final String HealthModify = "HealthModify";
	/**
	 * 查询信息
	 */
	public static final String PersonSearch = "PersonSearch";
	/**
	 * 下一步
	 */
	public static final String PushNextStep = "PushNextStep";
	/**
	 * 疾病调理
	 */
	//	"解析疾病调理
	public static final String DiseaseConditioning = "DiseaseConditioning";
	/**
	 * 日常保健
	 */
	//	"解析日常保健
	public static final String DailyHealthCare = "DailyHealthCare";
	/**
	 * 喜欢的口味
	 */
	//	"解析喜欢的口味
	public static final String FavoriteTaste = "FavoriteTaste";
	/**
	 * 禁忌的口味
	 */
	//	"解析禁忌的口味
	public static final String TabooTaste = "TabooTaste";
	/**
	 * 喜欢的食材
	 */
	//	"解析喜欢的食材
	public static final String FavoriteFM = "FavoriteFM";
	
	/**
	 * 不喜欢的食材
	 */
	//	"解析不喜欢的食材
	public static final String DislikeFM = "DislikeFM";
	/**
	 * 确认跳过
	 */
	//"确认跳过
	public static final String ConfirmSkip = "ConfirmSkip";
	/**
	 * 完成
	 */
	// "完成
	public static final String Save = "Save";
	
	/**
	 * 更换头像
	 */
	public static final String changePhoto = "changePhoto";
	/**
	 * 打开wifi/打开网络
                     关闭wifi/关闭网络
	 */
	public static final String SwitchWifi = "SwitchWifi";
	/**
	 * 打开蓝牙/打开蓝牙
	         关闭蓝牙/关闭蓝牙
	 */
	public static final String SwitchBluetooth = "SwitchBluetooth";
	/**
	 * 最大声
	 */
	public static final String MaxVolume = "MaxVolume";
	/**
	 * 最小声
	 */
	public static final String MinVolume = "MinVolume";
	/**
	 * 声音大一点/声音调大
                     声音小一点/声音调小
	 */
	public static final String AdjustVolume = "AdjustVolume";
	/**
	 * 亮度亮一点/屏幕亮度调亮
                     亮度暗一点//屏幕亮度调暗
	 */
	public static final String AdjustBrightness = "AdjustBrightness";
	
	/**
	 *音量调到百分之五十
	 */
	public static final String volumeControl = "volumeControl";
	/**
	 *打开相机
	 */
	public static final String photo = "photo";
	
	/**
	 * 家庭推荐
	 */
	public static final String RecipeRecommend = "RecipeRecommend";
	/**
	 * 套餐定制
	 */
	public static final String SetMeal = "SetMeal";
	/**
	 * 时令食材列表
	 */
	public static final String FoodMaterials = "FoodMaterials";
	/**
	 * 食材之食谱列表
	 */
	public static final String RecipesForFM = "RecipesForFM";
	/**
	 * 食材食谱列表页索引
	 */
	public static final String GetRIndexForFM = "GetRIndexForFM";
	/**
	 * 左边食材右边食谱列表页索引
	 */
	public static final String GetRIndexForIngredients = "GetRIndexForIngredients";
	/**
	 * 食材食谱详情
	 */
	public static final String OpenRecipeDetail = "OpenRecipeDetail";
	/**
	 * 食材详情 OpenFMDetail " 
	 */
	public static final String OpenFMDetail = "OpenFMDetail";
	
	/**
	 *  功效之食谱列表
	 */
	public static final String RecipesForEfficacy = "RecipesForEfficacy";
	/**
	 * 功效食谱列表页索引
	 */
	public static final String GetRIndexForEffi = "GetRIndexForEffi";
	/**
	 * 功效详情
	 */
	public static final String EfficacyDetail = "EfficacyDetail";
	/**
	 * 功效列表
	 */
	public static final String Efficacies = "Efficacies";
	/**
	 * 口味之食谱列表
	 */
	public static final String RecipesForTaste = "RecipesForTaste";
	/**
	 * 口味食谱列表页索引
	 */
	public static final String GetRIndexForTaste = "GetRIndexForTaste";
	/**
	 * 口味列表
	 */
	public static final String Tastes = "Tastes";
	/**
	 * 人群之食谱列表
	 */
	public static final String RecipesForCrowd = "RecipesForCrowd";
	/**
	 * 人群食谱列表页索引
	 */
	public static final String GetRIndexForCrowd = "GetRIndexForCrowd";
	/**
	 * 人群详情
	 */
	public static final String OpenCrowdDetail = "OpenCrowdDetail";
	/**
	 * 人群列表
	 */
	public static final String Crowds = "Crowds";
	/**
	 * 食材播报
	 */
	public static final String BoardcastFM = "BoardcastFM";
	/**
	 * 步骤播报
	 */
	public static final String BoardcastRecipeStep = "BoardcastRecipeStep";
	/**
	 * 手动制作
	 */
	public static final String ManualCooking = "ManualCooking";
	/**
	 * 食谱制作按钮
	 */
	public static final String PushCookingBtn = "PushCookingBtn";
	/**
	 * 食谱启动制作
	 */
	public static final String StartCooking = "StartCooking";
	/**
	 * 食谱预约
	 */
	public static final String BookRecipe = "BookRecipe";
	
	/**
	 * 天气指令
	 */
	public static final String InquireWeather = "InquireWeather";
	/**
	 * 股票指令
	 */
	public static final String InquireStock = "InquireStock";
	/**
	 * 退出指令.需求就是小写。
	 */
	public static final String exit = "exit";
	
	/**
	 * 检查连接指令
	 */
	public static final String checkConnection = "checkConnection";
	/**
	 * 检查异常指令
	 */
	public static final String checkException = "checkException";
	/**
	 * 检查胶囊是否放入指令
	 */
	public static final String checkItem = "checkItem";
	/**
	 * 开始制作指令
	 */
	public static final String startMake = "startMake";
	
	/**
	 * 单次预约制作指令
	 */
	public static final String reserveMake = "RESERVE_MAKE";
	/**
	 * 单次预约清洗指令
	 */
	public static final String reserveClear = "RESERVE_CLEAR";
	/**
	 * 单次预约深度清洗指令
	 */
	public static final String reserveDeepClear = "RESERVE_DEEPCLEAR";
	/**
	 * 多次预约制作指令
	 */
	public static final String cycleReserveMake = "CYCLERESERVE_MAKE";
	/**
	 * 多次预约清洗指令
	 */
	public static final String cycleReserveClear = "CYCLERESERVE_CLEAR";
	/**
	 * 多次预约深度清洗指令
	 */
	public static final String cycleReserveDeepClear = "CYCLERESERVE_DEEPCLEAR";
	/**
	 * 立即制作指令
	 */
	public static final String nowMake = "NOW_MAKE";
	/**
	 * 立即清洗指令
	 */
	public static final String nowClear = "NOW_CLEAR";
	/**
	 * 立即深度清洗指令
	 */
	public static final String nowDeepClear = "NOW_DEEPCLEAR";
	/**
	 * 立即深度清洗指令
	 */
	public static final String DeviceCancel = "DeviceCancel";
	
	/**
	 * 根据业务需求，聊天模块说闭嘴，休息的时候
	 */
	public static final String RecognizeCancel = "RecognizeCancel";
	/**
	 * 根据业务需求。其他模块说闭嘴，休息的时候
	 */
	public static final String speakStop = "speakStop";
	/**
	 * 根据业务需求，音乐模块暂停指令说闭嘴，休息
	 */
	public static final String pause = "pause";
	/**
	 * 闹钟提醒指令
	 */
	public static final String AlamClock = "AlamClock";
	/**
	 * 闹钟提醒指令
	 */
	public static final String AlarmCancel = "AlarmCancel";
	/**
	 * 闹钟提醒指令
	 */
	public static final String AlarmCancelAll = "AlarmCancelAll";
	/**
	 * 闹钟提醒指令
	 */
	public static final String ReserveList = "ReserveList";
	
	/**
	 * 根据业务需求，家庭推荐操作指令
	 */
	public static final String GetRIndexForRecommend = "GetRIndexForRecommend";
	/**
	 * 根据业务需求，套餐操作指令
	 */
	public static final String GetRIndexForCombo = "GetRIndexForCombo";
	/**
	 * 单曲循环指令
	 */
	public static final String OPR_SINGLE_LOOP = "single_loop";
	/**
	 * 列表循环指令
	 */
	public static final String OPR_MULTI_LOOP = "multi_loop";
	/**
	 * 顺序播放指令
	 */
	public static final String OPR_SEQ_PLAY = "seq_play";
	/**
	 * 倒带指令
	 */
	public static final String OPR_BACK = "back";
	/**
	 * 快进指令
	 */
	public static final String OPR_FORWARD = "forward";
	/**
	 * 收藏单曲
	 */
	public static final String OPR_LOVED_ONE = "loved_one";
	/**
	 * 收藏多曲
	 */
	public static final String OPR_LOVED_MANY = "loved_many";
	/**
	 * 关机指令
	 */
	public static final String OPR_SHUTDOWN = "ShutDown";
	/**
	 * 休眠指令
	 */
	public static final String OPR_SLEEEP = "Sleep";
	/**
	 * 火车票提醒
	 */
	public static final String TRAINREMIND = "train_remind";
	/**
	 * 机票提醒
	 */
	public static final String PLANEREMIND = "plane_remind";
	
}