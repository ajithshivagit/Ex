package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


    @FindBy(xpath = "//button[text()='SignUp']")
    WebElement signUp;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement login;

    public void clickOnLoginHome() {
        login.click();
    }
    
    @FindBy(xpath = "//input[@name='email']")
    WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    WebElement pass;

    @FindBy(xpath = "//button[text()='Sign in']")
    WebElement signInButton;


    
    public void enterEmail(String emailId) {
        email.sendKeys(emailId);
    }

    public void enterPassword(String password) {
        pass.sendKeys(password);
    }
    
    public void clickSignIn() {
    		signInButton.click();
    }
    
    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginLink;

    public void clickOnLogin() {
        loginLink.click();
    }
	
}
