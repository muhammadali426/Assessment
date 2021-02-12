package stepDefinitions;






import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.Login;


public class stepDefinition   {

	
	
	@Steps
	Login l;

	

@Given("user in on consult.attendanywhere login page")
public void user_in_on_consult_attendanywhere_login_page() {
    // Write code here that turns the phrase above into concrete actions
     
	l.openUrl();
	 
}

@Given("Validate hint of UserName and Password")
public void validate_hint_of_UserName_and_Password() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    
	l.validateHints();
	
}

@Given("Validate Keep me signed in is positioned between password field and sign in button")
public void validate_Keep_me_signed_in_is_positioned_between_password_field_and_sign_in_button() {
    // Write code here that turns the phrase above into concrete actions
    l.validatePosition();
	
}

@Given("Forgot your password? Reset it now link is displayed below Sign in button")
public void forgot_your_password_Reset_it_now_link_is_displayed_below_Sign_in_button() {
    // Write code here that turns the phrase above into concrete actions
    l.validatePostion1();
	
}

@Given("Minimize the window")
public void minimize_the_window() {
    // Write code here that turns the phrase above into concrete actions
    
	l.minimizeWindow();
}

@When("Enter enter wrong Username and Password")
public void enter_enter_wrong_Username_and_Password() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    l.enterWrongLoginDetails();
}

@When("Enter enter correct Username and Password")
public void enter_enter_correct_Username_and_Password() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 l.enterLoginDetails();
	
}



@Then("user can sign into the application")
public void user_can_sign_into_the_application() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    l.nextPage();
	
}





	
	
	}

