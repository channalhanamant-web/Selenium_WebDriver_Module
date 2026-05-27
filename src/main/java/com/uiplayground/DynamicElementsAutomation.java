package com.uiplayground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElementsAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");
		wd.manage().window().maximize();

		By dynamicElementsLocator = By.xpath("//div[@data-testid=\"nav-1\"]");
		WebElement dynamicElements = wd.findElement(dynamicElementsLocator);
		dynamicElements.click();

		By addMenuItemButtonLocator = By.xpath("//button[@data-testid=\"btn-add-item\"]");
		WebElement addMenuItemButton = wd.findElement(addMenuItemButtonLocator);
		addMenuItemButton.click();
		Thread.sleep(5000);
		addMenuItemButton.click();
		Thread.sleep(5000);
		addMenuItemButton.click();
		Thread.sleep(5000);

		By swiggyCardLocator = By.cssSelector(".swiggy-card");
		List<WebElement> foodItemList = wd.findElements(swiggyCardLocator);
		System.out.println(foodItemList.size());
		for (WebElement foodItem : foodItemList) {

			By foodItemNameLocator = By.xpath(".//div[@class=\"swiggy-name\"]");
			WebElement foodItemName = foodItem.findElement(foodItemNameLocator);
			System.out.println(foodItemName.getText());

			By foodItemPriceLocator = By.xpath(".//span[@class=\"swiggy-price\"]");
			WebElement foodItemPrice = foodItem.findElement(foodItemPriceLocator);
			System.out.println(foodItemPrice.getText());
		}

		By liveCounterLocator = By.cssSelector(".counter-badge");
		WebElement liveCounter = wd.findElement(liveCounterLocator);
		System.out.println(liveCounter.getText());

		// button[@data-testid="btn-toggle-visibility"]

		By hideMenuButtonLocator = By.xpath("//button[@data-testid=\"btn-toggle-visibility\"]");
		WebElement hideMenuButton = wd.findElement(hideMenuButtonLocator);
		hideMenuButton.click();

		// span[@data-testid="visibility-state"]

		By visibilityStateLocator = By.xpath("//span[@data-testid=\"visibility-state\"]");
		WebElement visibilityState = wd.findElement(visibilityStateLocator);
		System.out.println("Menu visibility state " + visibilityState.getText());

	}

}
