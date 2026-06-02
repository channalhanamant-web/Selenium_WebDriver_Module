package com.uiplayground;

import java.time.Duration;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitScenariosAssignment3Part1 {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");
		wd.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));

		By explicitWaitTextBoxLocator = By.xpath("//div[@data-testid=\"nav-27\"]");
		WebElement explicitWaitTextBox = wait
				.until(ExpectedConditions.elementToBeClickable(explicitWaitTextBoxLocator));
		explicitWaitTextBox.click();

		System.out.println("........Task 1 ..........");

		long startTime = System.currentTimeMillis();

		By triggerButtonElementLocator = By.xpath("//button[@data-testid=\"btn-trigger-visible\"]");
		WebElement triggerButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(triggerButtonElementLocator));
		triggerButtonElement.click();

		By targetVisibilityLocator = By.xpath("//div[@data-testid=\"wait-visibility-target\"]");
		WebElement targetVisibility = wait
				.until(ExpectedConditions.visibilityOfElementLocated(targetVisibilityLocator));
		System.out.println(targetVisibility.getText());

		long endTime = System.currentTimeMillis();
		System.out.println("Duration -> " + (endTime - startTime) / 1000);

		System.out.println("........Task 2 ..........");

		By taskTwoDisableButtonLocator = By.xpath("//button[@data-testid=\"wait-clickable-target\"]");
		WebElement taskTwoDisableButton = wait
				.until(ExpectedConditions.visibilityOfElementLocated(taskTwoDisableButtonLocator));
		String status = taskTwoDisableButton.getAttribute("disabled");
		System.out.println("Disabled? " + status);

		By taskTwotriggerButtonElementLocator = By.xpath("//button[@data-testid=\"btn-trigger-clickable\"]");
		WebElement taskTwotriggerButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(taskTwotriggerButtonElementLocator));
		taskTwotriggerButtonElement.click();

		By taskTwoClickableElementLocator = By.xpath("//button[@data-testid=\"wait-clickable-target\"]");
		WebElement taskTwoClickableElement = wait
				.until(ExpectedConditions.elementToBeClickable(taskTwoClickableElementLocator));
		taskTwoClickableElement.click();

		String status2 = taskTwoDisableButton.getAttribute("disabled");
		System.out.println("Disabled? " + status2);

		
		
		System.out.println("........Task 3 ..........");
		
		By taskThreeEnterTextBoxLocator = By.xpath("//div[@data-testid=\"wait-text-target\"]");
		WebElement taskThreeEnterTextBox = wait
				.until(ExpectedConditions.visibilityOfElementLocated(taskThreeEnterTextBoxLocator));
		System.out.println(taskThreeEnterTextBox.getText());

	

		By taskThreetriggerButtonElementLocator = By.xpath("//button[@data-testid=\"btn-trigger-text\"]");
		WebElement taskThreetriggerButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(taskThreetriggerButtonElementLocator));
		taskThreetriggerButtonElement.click();

		Boolean taskThreeEnteredText = wait
				.until(ExpectedConditions.textToBePresentInElementLocated(taskThreeEnterTextBoxLocator, "injected "));
		System.out.println(taskThreeEnteredText);

		taskThreeEnterTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(taskThreeEnterTextBoxLocator));
		System.out.println(taskThreeEnterTextBox.getText());
		

	}

}
