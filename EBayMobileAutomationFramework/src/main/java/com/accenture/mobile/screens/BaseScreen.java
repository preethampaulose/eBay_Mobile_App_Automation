package com.accenture.mobile.screens;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public abstract class BaseScreen {
    
    protected AppiumDriver<?> driver;

    protected BaseScreen(AppiumDriver<?> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    protected boolean enterText(String text, WebElement element){
	element.sendKeys(text + "\n");
	return element.getText().contains(text);
	
    }
    
    protected void swipeup() {
	Dimension dimension = driver.manage().window().getSize();

	    int startX = 0;
	    int endX = 0;
	    int startY = 0;
	    int endY = 0;
	    endY = (int) (dimension.height * 0.70);
            startY = (int) (dimension.height * 0.30);
            startX = (dimension.width / 2);
            Double ScreenWidthStart = dimension.getHeight() * 0.30;
            int scrollStart = ScreenWidthStart.intValue();
            Double ScreenWidthEnd = dimension.getHeight() * 0.70;
            int scrollEnd = ScreenWidthEnd.intValue();
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(scrollStart, startX))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(scrollEnd, startX))
                    .release()
                    .perform();
    }
}
