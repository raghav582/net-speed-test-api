package com.net.speed.test.api.model;

public class ModelResponse {

	private boolean success;
	private String message;
	private Object data;
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	ModelResponse(boolean success) {
		this.success = success;
	}
	
	ModelResponse(boolean success, String message) {
		this.success = success;
		this.message = message;
	}
	
	ModelResponse(boolean success, Object data) {
		this.success = success;
		this.data = data;
	}
	
	public static ModelResponse ok() {
		return new ModelResponse(true);
	}
	
	public static ModelResponse ok(String message) {
		return new ModelResponse(true, message);
	}
	
	public static ModelResponse ok(Object data) {
		return new ModelResponse(true, data);
	}
	
	public static ModelResponse failed() {
		return new ModelResponse(false);
	}
	
	public static ModelResponse failed(String message) {
		return new ModelResponse(false, message);
	}
}
