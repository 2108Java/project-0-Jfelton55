package com.revature.presentation;

import java.util.Scanner;

import com.revature.models.User;
import com.revature.service.Authenticator;

public class PresentationImpl implements Presentation {

	private Authenticator auth;

public PresentationImpl(Authenticator auth) {
	this.auth = auth;
	
}
	




	public void welcomeMessage() {
	System.out.println("Welcome To Revature Bank! ");
	
}
	

public User loginMenu(Scanner sc) {
	
	System.out.println("Please login!");
	System.out.println("Username");
	
	String username = sc.nextLine();
	
	System.out.println("Password:");
	String password = sc.nextLine();
	
	boolean authenticated = auth.authenticate(username,password);
	User u = null;
	
	if(authenticated) {
		
		 u = auth.getUser(username);
		
	}else {
		System.out.println("Authentification Failed");
		System.out.println("Please Try again!");
	}
	
	return u;
	
	
	
	
}

	@Override
	public void display() {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

boolean loggingIn = true;
User user = null;



System.out.println("Welcome user!");
boolean running = true;


while(running) {
	
	System.out.println("Menu");
	System.out.println("1) View Balance ");
	System.out.println("2) Apply for new bank account");
	System.out.println("3) Make Deposit or Withdrawal");
	System.out.println("4) Transfer Funds");
	System.out.println("0) Exit the application ");
	
	String input = sc.nextLine();
	
	
	
}
switch(input) {

case "1": 
	seeAllTodos(user);
	break;
case "2":
	addTodoMenu(user, sc);
	break;
case "3":
	deleteTodoMenu(user);
	break;
case "4":
	completeTodoMenu(user);
	break;
case "0":
	running = false;
	System.out.println("Thanks for using my service!");
	break;
default: 
	System.out.println("Invalid input, try again!");
	
}

}












}




