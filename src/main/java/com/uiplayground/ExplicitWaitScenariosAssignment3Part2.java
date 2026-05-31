package com.uiplayground;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitScenariosAssignment3Part2 {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");
		wd.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));

		By explicitWaitTextBoxLocator = By.xpath("//div[@data-testid=\"nav-27\"]");
		WebElement explicitWaitTextBox = wait
				.until(ExpectedConditions.elementToBeClickable(explicitWaitTextBoxLocator));
		explicitWaitTextBox.click();

		System.out.println("........Task 4 ..........");
		
		//div[@data-testid="wait-invisible-target"]
		
		By loadTextDisplayLocator=By.xpath("//div[@data-testid=\"wait-invisible-target\"]");
		WebElement loadTextDisplay=wait.until(ExpectedConditions.visibilityOfElementLocated(loadTextDisplayLocator));
		boolean loadText= loadTextDisplay.isDisplayed();
		System.out.println(loadText);

		//button[@data-testid="btn-trigger-invisible"]
		
		By triggerButtonLocator=By.xpath("//button[@data-testid=\"btn-trigger-invisible\"]");
		WebElement triggerButton=wait.until(ExpectedConditions.elementToBeClickable(triggerButtonLocator));
		triggerButton.click();
		
		//By loadTextDisplayLocator=By.xpath("//div[@data-testid=\"wait-invisible-target\"]");
		//loadTextDisplay=wait.until(ExpectedConditions.invisibilityOfElementLocated(loadTextDisplayLocator));


	}

}
