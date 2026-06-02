package com.uiplayground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");
		wd.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
		
		By fileUploadPageLocator=By.xpath("//div[@data-testid=\"nav-5\"]");
		WebElement fileUploadPage= wait.until(ExpectedConditions.elementToBeClickable(fileUploadPageLocator));
		fileUploadPage.click();
		
		By fileInputLocator =By.xpath("//input[@data-testid=\"file-input\"]");
		WebElement fileInput= wait.until(ExpectedConditions.presenceOfElementLocated(fileInputLocator));
		fileInput.sendKeys("C:\\Users\\user\\OneDrive\\Desktop\\Demo.txt");

		By fileListMenuLocator=By.xpath("//div[@data-testid=\"file-list\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(fileListMenuLocator));

		fileInput.sendKeys("C:\\Users\\user\\OneDrive\\Desktop\\DSC_0012.jpg");
		
		By fileInfoElementLocator= By.xpath("//div[@data-testid=\"file-list\"]/div");
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(fileInfoElementLocator, 1));
		List<WebElement> fileInfoElements=wd.findElements(fileInfoElementLocator);
		//System.out.println(fileInfoElements.size());
		
		int uploaded=0;
		int rejected=0;
		
		for (WebElement fileData : fileInfoElements) {
			System.out.print(fileData.findElement(By.xpath(".//span[@class=\"file-name\"]")).getText()+ " ");
			System.out.print(fileData.findElement(By.xpath(".//span[@class=\"file-size\"]")).getText()+ " ");
			String statuString=fileData.findElement(By.xpath(".//span[@class=\"file-status\"]")).getText();
			System.out.println(statuString);
			if (statuString.equalsIgnoreCase("Uploaded")) {
				uploaded++;
			}
			else if (statuString.equalsIgnoreCase("rejected")) {
				rejected++;			
				}
			else {
				System.out.println("nothing to upload ");
			}
			
			
			
		}
		System.out.println("Number of files Uploaded is "+uploaded);
		System.out.println("Number of files Rejected is "+rejected);
	}

}
