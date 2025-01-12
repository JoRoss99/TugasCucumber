package com.joross.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutPage {
    WebDriver driver;

    By inputFirstName = By.id("first-name");
    By inputLastName = By.id("last-name");
    By inputPostalCode = By.id("postal-code");
    By continueButton = By.xpath("//*[@id=\"continue\"]");
    By checkoutOverviewTitle = By.xpath("//*[@class=\"title\"]");
    By totalPriceWithTax = By.xpath("//*[contains(@class, \"summary_total_label\")]");
    By finishButton = By.xpath("//*[@id=\"finish\"]");
    By checkoutCompleteTitle = By.xpath("//*[@class=\"title\"]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickcontinue() {
        driver.findElement(continueButton).click();
    }

    public void overviewpage() {
        WebElement element = driver.findElement(checkoutOverviewTitle);
        assertTrue(element.isDisplayed());
    }

    public void totalprice() {
        WebElement element = driver.findElement(totalPriceWithTax);
        assertTrue(element.isDisplayed());
    }

    public void finishbutton() {
        driver.findElement(finishButton).click();
    }

    public void complete() {
        WebElement element = driver.findElement(checkoutCompleteTitle);
        assertTrue(element.isDisplayed());
    }

    public void fillinfo() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(inputFirstName));

        // Interact with the element
        element.click();
        driver.findElement(inputFirstName).sendKeys("David");
        driver.findElement(inputLastName).sendKeys("Sam");
        driver.findElement(inputPostalCode).sendKeys("12345");
    }
}