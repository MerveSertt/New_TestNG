package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
public class Page {
    public Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement login;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement products;

    @FindBy(xpath = "(//*[text()='View Product'])[1]")
    public WebElement viewProducts;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement addToCart;

    @FindBy(xpath = "(//p[@class='text-center'])[2]")
    public WebElement viewCart;

    @FindBy(xpath = "//td[@class='cart_description']")
    public WebElement product;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvc;

    @FindBy(xpath = "//input[@name='expiry_month']")
    public WebElement expirationMonth;

    @FindBy(xpath = "//input[@name='expiry_year']")
    public WebElement expirationYear;

    @FindBy(xpath = "//button[@class='form-control btn btn-primary submit-button']")
    public WebElement payAndConfirmOrderButton;

    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement successConfirmMessage;

}