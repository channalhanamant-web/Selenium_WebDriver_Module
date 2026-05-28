package com.uiplayground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicElementsAutomation_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");

		wd.manage().window().maximize();

		// explicit wait-- works on state of the element?? visible, present, clickable

		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));

		By dynamicElementsLocator = By.xpath("//div[@data-testid=\"nav-1\"]");
		// WebElement dynamicElements = wd.findElement(dynamicElementsLocator);
		WebElement dynamicElements = wait.until(ExpectedConditions.elementToBeClickable(dynamicElementsLocator));
		dynamicElements.click();

		By addMenuItemButtonLocator = By.xpath("//button[@data-testid=\"btn-add-item\"]");
		// WebElement addMenuItemButton = wd.findElement(addMenuItemButtonLocator);
		WebElement addMenuItemButton = wait.until(ExpectedConditions.elementToBeClickable(addMenuItemButtonLocator));
		addMenuItemButton.click();
		// Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(addMenuItemButtonLocator));
		addMenuItemButton.click();
		// Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(addMenuItemButtonLocator));
		addMenuItemButton.click();
		// Thread.sleep(5000);

		By swiggyCardLocator = By.cssSelector(".swiggy-card");
		// List<WebElement> foodItemList = wd.findElements(swiggyCardLocator);
		List<WebElement> foodItemList = wait
				.until(ExpectedConditions.numberOfElementsToBeMoreThan(swiggyCardLocator, 2));
		System.out.println(foodItemList.size());
		for (WebElement foodItem : foodItemList) {

			By foodItemNameLocator = By.xpath(".//div[@class=\"swiggy-name\"]");
			WebElement foodItemName = foodItem.findElement(foodItemNameLocator);
			// WebElement foodItemName =
			// wait.until(ExpectedConditions.visibilityOfElementLocated(swiggyCardLocator));
			System.out.println(foodItemName.getText());

			By foodItemPriceLocator = By.xpath(".//span[@class=\"swiggy-price\"]");
			WebElement foodItemPrice = foodItem.findElement(foodItemPriceLocator);
			// WebElement foodItemPrice =
			// wait.until(ExpectedConditions.visibilityOfElementLocated(swiggyCardLocator));
			System.out.println(foodItemPrice.getText());
		}

		By liveCounterLocator = By.cssSelector(".counter-badge");
		// WebElement liveCounter = wd.findElement(liveCounterLocator);
		WebElement liveCounter = wait.until(ExpectedConditions.visibilityOfElementLocated(liveCounterLocator));
		System.out.println(liveCounter.getText());

		By hideMenuButtonLocator = By.xpath("//button[@data-testid=\"btn-toggle-visibility\"]");
		// WebElement hideMenuButton = wd.findElement(hideMenuButtonLocator);
		WebElement hideMenuButton = wait.until(ExpectedConditions.elementToBeClickable(hideMenuButtonLocator));
		hideMenuButton.click();

		By visibilityStateLocator = By.xpath("//span[@data-testid=\"visibility-state\"]");
		// WebElement visibilityState = wd.findElement(visibilityStateLocator);
		WebElement visibilityState = wait.until(ExpectedConditions.elementToBeClickable(visibilityStateLocator));
		System.out.println("Menu visibility state " + visibilityState.getText());

	}

}
