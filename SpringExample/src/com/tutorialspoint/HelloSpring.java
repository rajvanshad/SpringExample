package com.tutorialspoint;

public class HelloSpring {

	
	private String message;

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Bean is going through the init");
	}
	
	public void destroy() {
		System.out.println("Bean will be distroyed");
	}
}
