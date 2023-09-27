package step_defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber_baseclass.Baseclass;
import cucumber_runner.Test_runner_class;
import pom_class.loginpage;
import pom_class.overallpage;
import pom_class.purchasepage;

public class Step_Defination_class extends Baseclass{
	public static WebDriver driver = Test_runner_class.driver;
	public static loginpage log = new loginpage(driver);
//	public static purchasepage pur = new purchasepage();
//	public static overallpage ovl = new overallpage();
	

@Given("^user Launch Application$")
public void user_Launch_Application() throws Throwable {
	geturl("https://www.nykaa.com/");
  
   
}

@When("^User click the signup button$")
public void user_click_the_signup_button() throws Throwable {
  action_click(log.getClick());
   
}

@When("^user enter the mobile number and click the send OTP button to navigate OTP page$")
public void user_enter_the_mobile_number_and_click_the_send_OTP_button_to_navigate_OTP_page() throws Throwable {
  
   
}

@When("^user enter the OTP number and click the verifey button to navigate menu page$")
public void user_enter_the_OTP_number_and_click_the_verifey_button_to_navigate_menu_page() throws Throwable {
  
   
}

@When("^user click on the search box$")
public void user_click_on_the_search_box() throws Throwable {
  
   
}

@When("^user enter the prodect name and click on the search button$")
public void user_enter_the_prodect_name_and_click_on_the_search_button() throws Throwable {
  
   
}

@Then("^navigate to search prodect page sccesfully loded in  search prodect page$")
public void navigate_to_search_prodect_page_sccesfully_loded_in_search_prodect_page() throws Throwable {
  
   
}

@When("^user click on the prodect$")
public void user_click_on_the_prodect() throws Throwable {
  
   
}

@Then("^navigate prodect select page sccesfully loded in  prodect select page$")
public void navigate_prodect_select_page_sccesfully_loded_in_prodect_select_page() throws Throwable {
  
   
}

@When("^user click on the add cart button$")
public void user_click_on_the_add_cart_button() throws Throwable {
  
   
}

@When("^user click on the add cart icon button$")
public void user_click_on_the_add_cart_icon_button() throws Throwable {
  
   
}

@When("^user click on the Process button$")
public void user_click_on_the_Process_button() throws Throwable {
  
   
}

@Then("^navigate to payment page sccesfully loded in payment page$")
public void navigate_to_payment_page_sccesfully_loded_in_payment_page() throws Throwable {
  
   
}

@When("^user select the payment mode$")
public void user_select_the_payment_mode() throws Throwable {
  
   
}

@When("^click on the payment button$")
public void click_on_the_payment_button() throws Throwable {
  
   
}

@Then("^navigate to prodect order Sccesfull page$")
public void navigate_to_prodect_order_Sccesfull_page() throws Throwable {
  
   
}


}
