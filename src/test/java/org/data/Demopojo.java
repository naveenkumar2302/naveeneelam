package org.data;

import java.io.IOException;

public class Demopojo extends Baseclass {
	public static void main(String[] args) throws IOException {
		
		browserlaunch("chrome");
		loadurl("https://www.facebook.com/");
		Pojjo ll=new Pojjo();
		sende(ll.user,Getdatas(0, 0));
		sende(ll.passs, Getdatas(0, 1));
		//Thread.sleep(3000);
		clickok(ll.logo);
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().refresh();
		sende(ll.user,"billa pandi");
		sende(ll.passs, "123456");
		
		
		//clickok(ll.logo);
		
		
		
	}

}
