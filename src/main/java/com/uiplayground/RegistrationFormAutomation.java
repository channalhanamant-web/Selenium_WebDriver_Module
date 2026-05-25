package com.uiplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormAutomation {

	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");
		wd.manage().window().maximize(); 
		
		By firstNameTextBoxLocator=By.xpath("//input[@data-testid=\'input-first-name\']");
		WebElement firstNameTextBox=wd.findElement(firstNameTextBoxLocator);
		firstNameTextBox.sendKeys("Hanamant");
		
		By lastNameTextBoxLocator= By.xpath("//input[@data-testid=\"input-last-name\"]");
		WebElement lastNameTextBox=wd.findElement(lastNameTextBoxLocator);
		lastNameTextBox.sendKeys("Channal");
		
		By emailIdTextBoxLocator = By.xpath("//input[@data-testid=\"input-email-reg\"]");
		WebElement emailIdTextBox=wd.findElement(emailIdTextBoxLocator);
		emailIdTextBox.sendKeys("hbc@gmail.com");
		
		By passwordTextBoxLocator = By.xpath("//input[@data-testid=\"input-password\"]");
		WebElement passwordTextBox=wd.findElement(passwordTextBoxLocator);
		passwordTextBox.sendKeys("password");
		
		By phoneNumTextBoxLocator = By.xpath("//input[@data-testid=\"input-phone\"]");
		WebElement phoneNumTextBox=wd.findElement(phoneNumTextBoxLocator);
		phoneNumTextBox.sendKeys("+91 7348971359");
		
		By maleRadioButtonLocator = By.xpath("//input[@value=\"Male\"]");
		WebElement maleRadioButton=wd.findElement(maleRadioButtonLocator);
		maleRadioButton.click();
		
		By termsAndConditionsCheckBoxLocator = By.xpath("//input[@data-testid=\"input-terms\"]");
		WebElement termsAndConditionsCheckBox=wd.findElement(termsAndConditionsCheckBoxLocator);
		termsAndConditionsCheckBox.click();
		
		
		
		
	}

}
