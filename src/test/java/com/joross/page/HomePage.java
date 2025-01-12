package com.joross.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;}

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By cartButton = By.xpath ("//*[@id=\"shopping_cart_container\"]/a");
    By detail = By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");


    public void goToCartPage() {
        driver.findElement(cartButton).click();
    }

    public void clickProductName(String item) {
        driver.findElement(productTitle).click();

    }

    public void detailproduct() {
        WebElement element = driver.findElement(detail);
        assertTrue(element.isDisplayed());
    }

    public void validateOnHomePage() {
        WebElement productName = driver.findElement(productTitle);
        Assert.assertEquals(productName.isDisplayed(), true);
    }
}

