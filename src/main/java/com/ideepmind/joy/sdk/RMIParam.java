package com.ideepmind.joy.sdk;

/**
 * @author tby
 * 通用原创调用参数
 */
public class RMIParam {
	private String serviceName;
	private String methodName;
	private Object[] args;
	
	public RMIParam() {
		
	}
	
	public RMIParam(String serviceName, String methodName, Object[] args) {
		super();
		this.serviceName = serviceName;
		this.methodName = methodName;
		this.args = args;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}
}
