package com.revature.models;

import java.util.List;

public class User {

	private int id;
	private String username;
	private String password;
	
	private List<Todo> todoList;

	
	public User() {
		super();
		
	}
	public User(int id, String username, String password, String name, List<Todo> todoList) {
		
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.todoList = todoList;
		
	
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Todo> getTodoList() {
		return todoList;
	}
	public void setTodoList(List<Todo> todoList) {
		this.todoList = todoList;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", todoList=" + todoList + "]";
	}
	
	
	
	
	
	
	
}

