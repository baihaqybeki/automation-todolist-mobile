package steps;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.splendapps.splendo.pages.MainPage;
import com.splendapps.splendo.pages.NewTask;
import com.splendapps.splendo.utils.Constants;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMain {
	
	private static AndroidDriver<MobileElement> driver;
	private MainPage main;
	private NewTask newTask;
	
	@When("Open apps")
	public void setup() throws MalformedURLException{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", Constants.deviceName);
		cap.setCapability("udid", Constants.udid);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Constants.platformName);
		cap.setCapability("platformVersion", Constants.platformVersion);
		cap.setCapability("automationName", Constants.automationName);
		cap.setCapability("appPackage", Constants.appPackage);
		cap.setCapability("appActivity", Constants.appActivity);
		cap.setCapability("noReset", true);
		
		driver = new AndroidDriver<MobileElement>(new URL(Constants.url),cap);
	}
	
	@And("click new task button")
	public void clickNewTask() {
		main.clickNewTask();
	}
	
	@Then("navigated to {string} page")
	public void validatePage(String title) {
		newTask.validatePage(title);
	}
	
	@And("fill task field with {string}")
	public void fillRequiredField(String task) {
		newTask.fillTaskName(task);
	}
	
	@And("choose repeat option with {string} & choose list with {string}")
	public void chooseOption(String repeat,String list) {
		newTask.chooseOption(repeat, list);
	}
	
	@And("click save button")
	public void clickSave() {
		newTask.clickSave();
	}
	
	@BeforeStep
	public void pageObject(){
		main = new MainPage(driver);
		newTask = new NewTask(driver);
	}
	
	@After
	public void closeApp() {
		driver.quit();
	}
	

}
