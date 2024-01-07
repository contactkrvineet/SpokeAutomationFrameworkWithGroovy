package com.vineetkr.pages

import com.vineetkr.VineetPageBase
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Action


class HomePage extends VineetPageBase{


    HomePage(WebDriver driver, Action actions)
    {
        super(driver,actions)
    }

    static WebElement getRedirectedURL(){
        return this.driver.getCurrentUrl();
    }
}
