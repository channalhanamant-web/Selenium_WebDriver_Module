package com.uiplayground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerCalendar {

	public static void main(String[] args) {
		
		
		WebDriver wd = new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");
		wd.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));

		By datePickerElementLocator = By.xpath("//div[@data-testid=\"nav-11\"]");
		wait.until(ExpectedConditions.elementToBeClickable(datePickerElementLocator)).click();
		
		
		By dateInputBoxLocator = By.cssSelector("#date-input");
		wait.until(ExpectedConditions.elementToBeClickable(dateInputBoxLocator)).click();
		
		
		
		By readAvailableDateLocator = By.cssSelector(".dp-header");
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(readAvailableDateLocator)).getText());
		
		
		
		By nextButtonLocator = By.cssSelector(".dp-btn-next");
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonLocator)).click();
		
		

		By selectDateLocator = By.cssSelector(".dp-day-available[data-testid=\"day-7\"]");
		wait.until(ExpectedConditions.elementToBeClickable(selectDateLocator)).click();	
		
		
		By selectedDateLocator = By.xpath("//div[@data-testid=\"selected-date\"]");
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(selectedDateLocator)).getText());
	}

}
