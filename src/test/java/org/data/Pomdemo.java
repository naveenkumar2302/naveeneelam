package org.data;

public class Pomdemo extends Baseclass  {
	
	public static void main(String[] args) {
		
		browserlaunch("chrome");
		loadurl("https://en-gb.facebook.com/");
		
		Pom l=new Pom();
		sende(l.getEmail(),"athira");
		sende(l.getPass(),"12345");
	 clickok(l.getLogin());
		
		
		
		
		
	}
	
	

}
