package com.moviemannia.action;

import com.moviemannia.model.LoginModel;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<LoginModel> {
	
	private static final long serialVersionUID = 1L;
	LoginModel loginModel ;
	
	@Override
	public String execute() throws Exception {
	 
		if(loginModel.getUserId().equalsIgnoreCase("admin")){
			return "admin";
		}else if(loginModel.getUserId().equalsIgnoreCase("user")){
			return "user";
		}
		return "SUCCESS";
	}

	public LoginModel getModel() {
		loginModel= new LoginModel();
		return loginModel;
	}

}
