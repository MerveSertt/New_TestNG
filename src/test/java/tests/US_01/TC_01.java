package tests.US_01;

import org.junit.Assert;
import org.junit.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC_01 extends ExtentReport {
    Page page = new Page();

    @Test
    public void TC01(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.logInMethod(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        ReusableMethods.scroll(page.loginButton);
        ReusableMethods.bekle(2);
        page.loginButton.click();
        page.products.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(page.viewProducts);
        ReusableMethods.bekle(2);
        page.viewProducts.click();
        page.addToCart.click();
        page.viewCart.click();
        Assert.assertTrue(page.product.isDisplayed());
        page.proceedToCheckoutButton.click();
        page.placeOrderButton.click();
        page.nameOnCard.sendKeys(ConfigReader.getProperty("nameOnCard"));
        page.cardNumber.sendKeys(ConfigReader.getProperty("cardNumber"));
        page.cvc.sendKeys(ConfigReader.getProperty("cvc"));
        page.expirationMonth.sendKeys(ConfigReader.getProperty("month"));
        page.expirationYear.sendKeys(ConfigReader.getProperty("year"));
        page.payAndConfirmOrderButton.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(page.successConfirmMessage.isDisplayed());

        ReusableMethods.tumSayfaResmi("TC_01");
    }
}
