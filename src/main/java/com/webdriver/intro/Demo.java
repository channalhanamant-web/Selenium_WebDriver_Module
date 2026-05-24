package com.webdriver.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.google.com");

	}

}
