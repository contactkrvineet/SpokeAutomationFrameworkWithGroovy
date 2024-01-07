package com.vineetkr.specs

import com.vineetkr.VineetSpecBase


class HomePageSpec extends VineetSpecBase {


    def launchApp() {
        openHomePage();

    }

    def "verify that I am redirected to home page "() {
        when: "I am at homepage"
        then: "I choose to get redirected Url"
        expect:
        1==1
        homePage.getRedirectedURL();
    }

    def quitBrowser() {
        quitApp()
    }


}
