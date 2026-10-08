package com.vishalhole.tests;

import com.vishalhole.base.BaseTest;
import com.vishalhole.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("tomsmith", "SuperSecretPassword!");

    }
}