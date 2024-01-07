package com.vineetkr

import com.vineetkr.pages.HomePage
import static com.vineetkr.VineetPageBase.driver
import static com.vineetkr.VineetPageBase.actions

import spock.lang.Specification


class VineetSpecBase extends Specification {

    HomePage homePage = new HomePage(driver, actions)

    static openHomePage() {
        VineetPageBase.launchChromeBrowser(Constants.BASE_URL)
        VineetPageBase.waitForPageLoad(5)

    }

    static quitApp() {
       driver.quit();
    }
}
