package tests.US_01;

import org.junit.Assert;
import org.junit.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC_03 {

    Page page = new Page();
    @Test
    public void TC03(){

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
        page.cvc.sendKeys(ConfigReader.getProperty("cvc"));
        page.expirationMonth.sendKeys(ConfigReader.getProperty("month"));
        page.expirationYear.sendKeys(ConfigReader.getProperty("year"));
        page.payAndConfirmOrderButton.click();
        ReusableMethods.bekle(2);
        String message = page.cardNumber.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("Lütfen bu alanı doldurun."));

        ReusableMethods.tumSayfaResmi("TC_03");
    }
}
