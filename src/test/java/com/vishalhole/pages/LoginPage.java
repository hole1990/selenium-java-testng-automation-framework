package com.vishalhole.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.cssSelector("button[type='submit']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String userName) {
        driver.findElement(username).sendKeys(userName);
    }

    public void enterPassword(String passWord) {
        driver.findElement(password).sendKeys(passWord);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String userName, String passWord) {
        enterUsername(userName);
        enterPassword(passWord);
        clickLogin();
    }
}