package com.amama.domain;

public class ApiResponse<T> {
private int status;
private String message ; 
private Object result;
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Object getResult() {
	return result;
}
public void setResult(Object result) {
	this.result = result;
}
@Override
public String toString() {
	return "ApiResponse [status=" + status + ", message=" + message + ", result=" + result + "]";
}
public ApiResponse(int status, String message, Object result) {
	super();
	this.status = status;
	this.message = message;
	this.result = result;
}
public ApiResponse() {
	super();
}




}
