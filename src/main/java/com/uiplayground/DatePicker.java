package com.uiplayground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");
		wd.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));

		By datePickerElementLocator = By.xpath("//div[@data-testid=\"nav-10\"]");
		wait.until(ExpectedConditions.elementToBeClickable(datePickerElementLocator)).click();
		
		By singleDateInputLocator=By.xpath("//input[@data-testid=\"date-single\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(singleDateInputLocator)).sendKeys("07/10/1998");
		
		By selectedDateLocator= By.xpath("//div[@data-testid=\"date-selected\"]");
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(selectedDateLocator)).getText());
		
		
		By fromDateRangeInputLocator=By.xpath("//input[@data-testid=\"date-from\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(fromDateRangeInputLocator)).sendKeys("07/10/1998");
		
		By toDateRangeInputLocator=By.xpath("//input[@data-testid=\"date-to\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(toDateRangeInputLocator)).sendKeys("06/01/2026");
		
		
		By selectedDateRangeLocator= By.xpath("//div[@data-testid=\"range-result\"]");
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(selectedDateRangeLocator)).getText());
		
		//input[@data-testid="time-picker"]
	}

}
