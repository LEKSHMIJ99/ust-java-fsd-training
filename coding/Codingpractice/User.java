package Codingpractice;

import java.util.Scanner;

import Codingpractice.User.UserBO;

public class User {
	private int id;
	private String username;
	private String password;
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
	User(int id,String username,String password){
		this.id=id;
		this.username=username;
		this.password=password;
	
}
class UserBO{
public 	String[] getUsers() {
String[] Users= {"lax","niki","sruthy"};
return(Users);
}
public String encryptpassword(String password)
{
	String bar = null;
	for(char c:password.toCharArray() ) {
		bar+=Character.toString((char) (c+1));}
	return bar;
}
boolean validate(String username,String password) {
	String a[]=getUsers();
	for(int i=0;i<a.length;i++) {
		if(username.compareTo(a[i])==0){
			System.out.println(username);
			return true;}
	}
	return false;}
}
}
class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		UserBO u1=new UserBO();
	System.out.println("enter username");
	String user=sc.next();
	System.out.println("enter password");
	String password=sc.next();
	User u=new User(1,user,password);
	u1.encryptpassword(password);
	if(u1.validate(user, password)==true) {
		System.out.println("login successful");
	}
	else
	{
		System.out.println("login unsuccessful");
	}
	}
}