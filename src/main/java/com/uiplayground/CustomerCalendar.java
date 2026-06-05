package com.uiplayground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

		System.out.println("-------------- Task 1 ----------------");

		By dateInputBoxLocator = By.cssSelector("#date-input");
		wait.until(ExpectedConditions.elementToBeClickable(dateInputBoxLocator)).click();

		By readAvailableDateLocator = By.cssSelector(".dp-header");
		System.out
				.println(wait.until(ExpectedConditions.visibilityOfElementLocated(readAvailableDateLocator)).getText());

		By nextButtonLocator = By.cssSelector(".dp-btn-next");
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonLocator)).click();

		By selectDateLocator = By.cssSelector(".dp-day-available");
		List<WebElement> listOfAvailableDates = wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectDateLocator));
		System.out.println(listOfAvailableDates.size());
		listOfAvailableDates.get(6).click();

		By selectedDateLocator = By.xpath("//div[@data-testid=\"selected-date\"]");
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(selectedDateLocator)).getText());

		System.out.println("-------------- Task 2 ----------------");

		By resetButtonLocator = By.xpath("//button[normalize-space()='Reset']");
		wait.until(ExpectedConditions.elementToBeClickable(resetButtonLocator)).click();

		wait.until(ExpectedConditions.elementToBeClickable(dateInputBoxLocator)).click();

		By disabledDatesLocator = By.cssSelector("td.dp-day.dp-day-disabled");
		List<WebElement> disabledDates = wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(disabledDatesLocator));

		for (WebElement disabledDate : disabledDates) {
			System.out.print(disabledDate.getText() + " ");
		}

		disabledDates.get(0).click();

		System.out.println(listOfAvailableDates.size());

		System.out.println("-------------- Task 3 ----------------");

		By dateRangeElementLocator = By.cssSelector("#btn-range-mode");
		wait.until(ExpectedConditions.elementToBeClickable(dateRangeElementLocator)).click();

		By dateRangeInputStartLocator = By.cssSelector("#range-input-start");
		wait.until(ExpectedConditions.elementToBeClickable(dateRangeInputStartLocator)).click();

		By selectStartDateLocator = By.cssSelector(".dp-day.dp-day-available");
		List<WebElement> listOfAvailableStartDates = wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectStartDateLocator));
		System.out.println(listOfAvailableStartDates.size());
		listOfAvailableStartDates.get(6).click();
		listOfAvailableStartDates.get(7).click();

		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(dateRangeInputStartLocator))
				.getAttribute("value"));

		By readEndDateLocator = By.cssSelector("#range-input-end");
		System.out.println(
				wait.until(ExpectedConditions.visibilityOfElementLocated(readEndDateLocator)).getAttribute("value"));

	}

}
