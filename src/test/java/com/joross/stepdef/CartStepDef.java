package com.joross.stepdef;

import com.joross.page.CartPage;
import com.joross.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CartStepDef {

    HomePage homePage;
    CartPage cartPage;
    WebDriver driver = LoginStepDef.driver;


    @And("user go to cart page")
    public void userGoToCartPage() {
        homePage = new HomePage(driver);
        homePage.goToCartPage();
    }

    @Then("cart should contain product {string}")
    public void cartShouldContainProduct(String productName) {
        cartPage = new CartPage(driver);
        cartPage.checkIfContainItem();
    }

    @And("user click on product with the name {string}")
    public void userClickOnProductWithTheName(String item) {
        homePage = new HomePage(driver);
        homePage.clickProductName(item);
    }

    @When("user click checkout")
    public void userClickCheckout() {
        cartPage = new CartPage(driver);
        cartPage.clickcheckout();
    }
}
