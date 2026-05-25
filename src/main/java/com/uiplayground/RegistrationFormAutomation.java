package com.uiplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormAutomation {

	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");
		wd.manage().window().maximize(); 
	}

}
