package pom_Scripts;
/**
 * OM
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPacage.Utility_Methods;

public class Login extends Utility_Methods{
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement usernameTF;
	public void entervalueIn_userNameTF(String username) {
		enter_Value(usernameTF,username );
	}
	@FindBy(name="pwd")
	WebElement passwordTF;
	public void entervalueIn_passwordTF(String password) {
		enter_Value(passwordTF, password);
	}
	@FindBy(id="loginButton")
	WebElement loginButton;
	public void clickLoginButton() {
		click_Action(loginButton);
	}

}
