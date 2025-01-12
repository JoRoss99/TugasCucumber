package com.joross.stepdef;

import com.joross.page.CartPage;
import com.joross.page.CheckoutPage;
import com.joross.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CheckoutStepDef {

    CartPage cartPage;
    CheckoutPage checkoutPage;
    HomePage homePage;
    WebDriver driver = LoginStepDef.driver;

    @And("user is on detail product page")
    public void userIsOnDetailProductPage() {
        homePage = new HomePage(driver);
        homePage.detailproduct();
    }

    @And("user click add to cart button")
    public void userClickAddToCartButton() {
        cartPage = new CartPage(driver);
        cartPage.clickadtochartbutton();
    }


    @And("user click continue button")
    public void userClickContinueButton() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickcontinue();
    }

    @And("user on checkout overview page")
    public void userOnCheckoutOverviewPage() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.overviewpage();
    }

    @And("total price is correct")
    public void totalPriceIsCorrect() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.totalprice();
    }

    @And("click finish button")
    public void clickFinishButton() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.finishbutton();
    }

    @Then("checkout complete")
    public void checkoutComplete() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.complete();
    }

    @And("user fill shipping information")
    public void userFillShippingInformation() throws InterruptedException {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillinfo();
    }
}


