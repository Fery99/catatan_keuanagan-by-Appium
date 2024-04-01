package utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

/**
 * Owned By : Arnab Majumder
 * This class contains all utility files for android
 */

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class AndroidUtils {

private AppiumDriver driver;
	

	/**
	 * Constructor to initialize the {@link} object
	 * 
	 * @param driver The {@link AppiumDriver} object
	 */
	public AndroidUtils(AppiumDriver driver) {
		this.driver = driver;
	}

	/**
	 * Function to pause the execution for the specified time period
	 * 
	 * @param milliSeconds The wait time in milliseconds
	 */
	public void WaitFor(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	

	
	public Boolean Assert (By by) {
		try {
			if (driver.findElements(by).size() == 0) {
				return false;
			} else {
				return true;
			}
		}catch (Exception ex){
			ex.printStackTrace();
			return false;
		}
	}


	public boolean Sendkeys (By xpath, String text) {
		boolean flag = false;
		try {
			if (driver.findElement(xpath).isDisplayed()) {
				driver.findElement(xpath).clear();
				driver.findElement(xpath).sendKeys(text);
//				driver.hideKeyboard();
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void swipeUp(AppiumDriver<?> driver, int steps) {
		Dimension size = driver.manage().window().getSize();
		int start_x = size.getWidth() / 2;
		int start_y = (int) (size.getHeight() * 0.8);  // Starting point from 80% of the screen height
		int end_y = (int) (size.getHeight() * 0.2);    // Ending point at 20% of the screen height
		int duration = 500;  // Duration of each step in milliseconds

		int pressX = start_x;
		int pressY = start_y;

		int moveX = start_x;
		int moveY = end_y;

		for (int i = 0; i < steps; i++) {
			TouchAction<?> action = new TouchAction<>(driver);
			action.press(PointOption.point(pressX, pressY))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
					.moveTo(PointOption.point(moveX, moveY))
					.release().perform();

			// Adjust the start_y for the next step
			pressY = moveY;
			moveY -= (start_y - end_y) / steps;
		}
	}

	public static void swipeDown(AppiumDriver<?> driver, int steps) {
		Dimension size = driver.manage().window().getSize();
		int start_x = size.getWidth() / 2;
		int start_y = (int) (size.getHeight() * 0.2);  // Starting point from 20% of the screen height
		int end_y = (int) (size.getHeight() * 0.8);    // Ending point at 80% of the screen height
		int duration = 500;  // Duration of each step in milliseconds

		int pressX = start_x;
		int pressY = start_y;

		int moveX = start_x;
		int moveY = end_y;

		for (int i = 0; i < steps; i++) {
			TouchAction<?> action = new TouchAction<>(driver);
			action.press(PointOption.point(pressX, pressY))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
					.moveTo(PointOption.point(moveX, moveY))
					.release().perform();

			// Adjust the start_y for the next step
			pressY = moveY;
			moveY += (end_y - start_y) / steps;
		}
	}
	
}
