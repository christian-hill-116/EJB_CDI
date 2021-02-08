package controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import beans.User;
import business.MyTimerService;
import business.OrdersBusinessInterface;

@Named @ManagedBean
public class FormController {
	
	@Inject
		OrdersBusinessInterface services;
	
	@EJB
	MyTimerService timer;
		
	
	public String onSubmit() {
		
		
		//get the user value from the input form
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		//prints message to console to tell us which business service is selected in beans.xml file as an alternative
		services.test();
		
		//start a timer when the login is clicked
		timer.setTimer(5000);
		
		//user object data in the console log
		System.out.println("You clicked the submit button");
		System.out.println("The first name is " + user.getFirstName());
		System.out.println("The last name is " + user.getLastName());
		
		
		//put user object into the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		//show the next page
		return "TestResponse.xhtml";
		
	}
	
	public OrdersBusinessInterface getService() {
		return services;
	}

}
