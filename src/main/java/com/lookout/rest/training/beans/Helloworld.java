package com.lookout.rest.training.beans;

public class Helloworld {
	
	private String message;

	public Helloworld(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Helloworld [message=" + message + "]";
	}
}
