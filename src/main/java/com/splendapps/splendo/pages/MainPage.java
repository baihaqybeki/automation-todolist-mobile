package com.splendapps.splendo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MainPage {
	
	private AndroidDriver<MobileElement> driver;
	
	public MainPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By newTaskBtn = By.id("com.splendapps.splendo:id/fabAddTask"); 
	
	public void clickNewTask() {
		delay(2);
		driver.findElement(newTaskBtn).click();
	}

	static void delay(int scnd) {
		try {
			Thread.sleep(scnd*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
