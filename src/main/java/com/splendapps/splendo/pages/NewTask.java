package com.splendapps.splendo.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import com.splendapps.splendo.utils.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NewTask {
	
	private AndroidDriver<MobileElement> driver;
	
	public NewTask(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By titlePage = By.xpath(Constants.titlePage);
	By taskField = By.id("com.splendapps.splendo:id/edtTaskName");
	By dueDateField = By.id("com.splendapps.splendo:id/edtDueD");
	By nextMonthBtn = By.id("android:id/next");
	By okBtn = By.id("android:id/button1");
	By dueTimeField = By.id("com.splendapps.splendo:id/edtDueT");
	By zeroTimePicker = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"0\"]");
	By twentyThreeTimePicker = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"23\"]");
	By twelveTimePicker = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"12\"]");
	By repeatList = By.id("com.splendapps.splendo:id/spinnerRepeat");
	By noRepeatOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
	By OnceADayOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
	By monFriOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
	By OnceAWeekOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
	By OnceAMonthOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]");
	By OnceAYearOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]");
	By otherOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[7]");
	By listOption = By.id("com.splendapps.splendo:id/spinnerLists");
	By defaultOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
	By personalOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
	By shoppingOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
	By wishlistOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
	By workOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]");
	By saveTaskBtn = By.id("com.splendapps.splendo:id/fabSaveTask");

	
	public void validatePage(String title) {
		String actual = driver.findElement(titlePage).getText();
		assertEquals(actual, title);
		
	}
	
	public void fillTaskName(String task) {
		driver.findElement(taskField).sendKeys(task);
		driver.findElement(dueDateField).click();
		driver.findElement(okBtn).click();
		assertTrue(driver.findElement(dueTimeField).isDisplayed());
		driver.findElement(dueTimeField).click();
		driver.findElement(twentyThreeTimePicker).click();
		driver.findElement(okBtn).click();
		
	}
	
	public void chooseOption(String repeat,String list) {

		driver.findElement(repeatList).click();
		delay(1);
		
		
		if (repeat.equalsIgnoreCase("other")) {
			driver.findElement(otherOption).click();
		} else if (repeat.equalsIgnoreCase("Once a Year")) {
			driver.findElement(OnceAYearOption).click();
		} else if (repeat.equalsIgnoreCase("Once a Month")) {
			driver.findElement(OnceAMonthOption).click();
		} else if (repeat.equalsIgnoreCase("Once a Week")) {
			driver.findElement(OnceAWeekOption).click();
		} else if (repeat.equalsIgnoreCase("Once a Day (Mon-Fri)")) {
			driver.findElement(monFriOption).click();
		} else if (repeat.equalsIgnoreCase("Once a Day")) {
			driver.findElement(OnceADayOption).click();
		} else if (repeat.equalsIgnoreCase("No repeat")) {
			driver.findElement(noRepeatOption).click();
		}
		
		driver.findElement(okBtn).click();
		delay(1);
		
		driver.findElement(listOption).click();
		delay(1);
		
		if (list.equalsIgnoreCase("Default")) {
			driver.findElement(defaultOption).click();
		} else if (list.equalsIgnoreCase("Personal")) {
			driver.findElement(personalOption).click();
		} else if (list.equalsIgnoreCase("Shopping")) {
			driver.findElement(shoppingOption).click();
		} else if (list == "Wishlist") {
			driver.findElement(wishlistOption).click();
		} else if (list.equalsIgnoreCase("Work")) {
			driver.findElement(workOption).click();
		}
		
	}
	
	public void clickSave() {
		driver.findElement(saveTaskBtn).click();
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
