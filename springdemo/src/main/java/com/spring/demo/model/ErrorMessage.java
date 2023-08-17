package com.spring.demo.model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
	private HttpStatus status;
	private String msg;

	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public ErrorMessage(HttpStatus status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	

}
