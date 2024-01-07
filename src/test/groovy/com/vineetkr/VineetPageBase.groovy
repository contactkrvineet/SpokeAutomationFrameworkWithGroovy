package com.vineetkr

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.interactions.Actions

class VineetPageBase {

    private static final ChromeOptions chromeOptions = new ChromeOptions();
    protected static WebDriver driver;
    protected static Actions actions;


    VineetPageBase(WebDriver driver, Actions actions) {
        this.driver = driver;
        this.actions = actions

    }

    static launchChromeBrowser(String url) {
        // System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH)
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setBinary(Constants.CHROME_PATH)
        driver = new ChromeDriver(chromeOptions)
        actions = new Actions(driver)
        this.driver.manage().window().maximize()
        this.driver.get(url)
        println("Url launching :"+ url)
    }

    static waitForPageLoad(int waitTimeInSec) {
        Thread.sleep(waitTimeInSec * 1000)
    }

}

