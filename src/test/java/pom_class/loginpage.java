package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber_baseclass.Baseclass;
import net.bytebuddy.asm.Advice.This;

public class loginpage {
	public static WebDriver driver ;

	public loginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(Baseclass.driver,this);
	}
@FindBy(xpath = "//button[text()='Sign in']")
private WebElement click;
public static WebDriver getDriver() {
	return driver;
}
public WebElement getClick() {
	return click;
}
public WebElement getEmailorphone() {
	return emailorphone;
}
public WebElement getPhonenumber() {
	return phonenumber;
}
public WebElement getProceedbutton() {
	return proceedbutton;
}
public WebElement getOtp() {
	return otp;
}
public WebElement getVerify() {
	return verify;
}
@FindBy(xpath = "//button[text()='Sign in with Mobile / Email']")
private WebElement emailorphone;
@FindBy(name = "emailMobile")
private WebElement phonenumber;
@FindBy(className = "button big fill full ")
private WebElement proceedbutton;
@FindBy(name = "otpValue")
private WebElement otp;
@FindBy(className = "button big fill full disabled")
private WebElement verify;




}
