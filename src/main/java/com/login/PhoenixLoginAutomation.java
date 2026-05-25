package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoenixLoginAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.get("https://phoenix.techwithjatin.com/sign-in");
		
		Thread.sleep(5000);
		
		By userNameTextBoxLocator=By.id("username");
		WebElement userNameTextBox =wd.findElement(userNameTextBoxLocator);
		userNameTextBox.clear();
		userNameTextBox.sendKeys("iamsup");
		
		By passwordTextBoxLocator = By.id("password");
		WebElement passwordTextBox = wd.findElement(passwordTextBoxLocator);
		passwordTextBox.clear();
		passwordTextBox.sendKeys("password");
		
		By signInButtonLocator = By.xpath("//span[contains(text(),\" Sign in\")]/../..");
		WebElement signInButton= wd.findElement(signInButtonLocator);
		signInButton.click();
		
		
		 

	}

}
