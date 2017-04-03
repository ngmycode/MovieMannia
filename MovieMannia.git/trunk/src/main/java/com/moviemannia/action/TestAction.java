package com.moviemannia.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		System.out.println("i am in action");
		return "SUCCESS";
	}

}
