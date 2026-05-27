package com.uiplayground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElementsAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");
		wd.manage().window().maximize(); 
		
		By dynamicElementsLocator=By.xpath("//div[@data-testid=\"nav-1\"]");
		WebElement dynamicElements=wd.findElement(dynamicElementsLocator);
		dynamicElements.click();

		By addMenuItemButtonLocator=By.xpath("//button[@data-testid=\"btn-add-item\"]");
		WebElement addMenuItemButton=wd.findElement(addMenuItemButtonLocator);
		addMenuItemButton.click();
		Thread.sleep(5000);
		addMenuItemButton.click();
		Thread.sleep(5000);
		addMenuItemButton.click();
		Thread.sleep(5000);
		
		 By swiggyCardLocator=By.cssSelector(".swiggy-card");
		List<WebElement> foodItemList=wd.findElements(swiggyCardLocator);
		System.out.println(foodItemList.size());
		for (WebElement foodItem : foodItemList) {
			
			By foodItemNameLocator=By.xpath(".//div[@class=\"swiggy-name\"]");
			WebElement foodItemName= foodItem.findElement(foodItemNameLocator);
			System.out.println(foodItemName.getText());
		}
		
		
		By liveCounterLocator=By.cssSelector(".counter-badge");
		WebElement liveCounter=wd.findElement(liveCounterLocator);
		System.out.println(liveCounter.getText());
		
		

	}

}
