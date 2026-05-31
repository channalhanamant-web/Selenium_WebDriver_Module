package com.uiplayground;

import java.time.Duration;

import org.jspecify.annotations.NonNull;
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
	
		
		By loadTextDisplayLocator=By.xpath("//div[@data-testid=\"wait-invisible-target\"]");
		WebElement loadTextDisplay=wait.until(ExpectedConditions.visibilityOfElementLocated(loadTextDisplayLocator));
		boolean loadText= loadTextDisplay.isDisplayed();
		System.out.println(loadText);

		
		By triggerButtonLocator=By.xpath("//button[@data-testid=\"btn-trigger-invisible\"]");
		WebElement triggerButton=wait.until(ExpectedConditions.elementToBeClickable(triggerButtonLocator));
		triggerButton.click();
		
	
		Boolean invisibleSpinner =wait.until(ExpectedConditions.invisibilityOfElementLocated(loadTextDisplayLocator));
		System.out.println(invisibleSpinner);
		
		
		
		System.out.println("........Task 5 ..........");
		
		
		By divTargetLocator=By.xpath("//div[@data-testid='wait-stale-target']");
		WebElement divTarget=wait.until(ExpectedConditions.visibilityOfElementLocated(divTargetLocator));
		System.out.println(divTarget.getAttribute("data-render-key"));
		
		

	    By divTargetTriggerButtonLocator=By.xpath("//button[@data-testid=\"btn-trigger-stale\"]");
		WebElement divTargetTriggerButton=wait.until(ExpectedConditions.elementToBeClickable(divTargetTriggerButtonLocator));
		divTargetTriggerButton.click();
		
		System.out.println(divTarget.getAttribute("data-render-key"));
		
		boolean status =wait.until(ExpectedConditions.stalenessOf(divTarget));
		System.out.println(status);
		WebElement divTargetNew=wait.until(ExpectedConditions.visibilityOfElementLocated(divTargetLocator));
		System.out.println(divTargetNew.getAttribute("data-render-key"));
		
		
		
		System.out.println("........Task 5 ..........");
		
		//input[@data-testid="wait-selected-target"]
		
	    By checkBoxLocator=By.xpath("//input[@data-testid=\"wait-selected-target\"]");
	    WebElement checkBox=wait.until(ExpectedConditions.elementToBeClickable(checkBoxLocator));
		boolean checkBoxSelect=checkBox.isSelected();
		System.out.println(checkBoxSelect);
		
		By checkBoxTriggerButtonLocator=By.xpath("//button[@data-testid=\"btn-trigger-selected\"]");
		WebElement checkBoxTriggerButton=wait.until(ExpectedConditions.elementToBeClickable(checkBoxTriggerButtonLocator));
		checkBoxTriggerButton.click();
		
		Boolean checkBoxNew=wait.until(ExpectedConditions.elementToBeSelected(checkBoxLocator));
		System.out.println(checkBoxNew);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
