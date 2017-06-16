package scripts.pageobjects;

import java.util.concurrent.TimeUnit;

import scripts.common.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

/**
 * This is the base class for JMeter GUI components which manage assertions.
 *
 * Assertions which can be applied to different scopes (parent, children or both)
 * need to use the createScopePanel() to add the panel to the GUI, and they also
 * need to use saveScopeSettings() and showScopeSettings() to keep the test element
 * and GUI in synch.
 *
 */
public class LoginPage {
	/**
	 * Login method
	 */
	private String usernameCSS = "#username";
	private String passwordCSS = "#password";
	private String loginBtnCSS = "#loginbutton > input[type = 'submit']";
	WebElementActions webAction = new WebElementActions();

	/**
	 * VSO login method
	 *
	 * @param vso
	 *
	 * @return this
	 *
	 */
	public void loginVSO(String vso, WebDriver driver) throws InterruptedException {

	}

	public void loginVSP() throws InterruptedException {

	}

}
