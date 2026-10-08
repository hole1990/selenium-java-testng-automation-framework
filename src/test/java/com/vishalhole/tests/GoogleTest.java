package com.vishalhole.tests;

import com.vishalhole.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void verifyGoogleTitle() {

        String actualTitle = driver.getTitle();

        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, "Google");
    }
}