package tests.US_01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06 {
    Page page = new Page();

    @Test
    public void TC06(){
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
        page.nameOnCard.sendKeys(ConfigReader.getProperty("randomNameOnCard"));
        page.cardNumber.sendKeys(ConfigReader.getProperty("randomCardNumber"));
        page.cvc.sendKeys(ConfigReader.getProperty("randomCvc"));
        page.expirationMonth.sendKeys(ConfigReader.getProperty("randomMonth"));
        page.expirationYear.sendKeys(ConfigReader.getProperty("randomYear"));
        page.payAndConfirmOrderButton.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(page.successConfirmMessage.isDisplayed());

        ReusableMethods.tumSayfaResmi("TC_06");

    }



}
