package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class SendEmail extends WebBase {

	public static WebDriver driver;
	
	
private By ClickOnEmailButton= By.xpath("//button[contains(@class, 'success_button') and span[text()=' Email Id ']]\n"
		+ "");

private By enterEmail = By.xpath("//input[@id='email' and @type='email']\n"
		+ "");
private By ClickOnSend = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-email-invoice/div/div[3]/button");




public void ClickOnEmailButton() throws InterruptedException {
	clickOnElement(ClickOnEmailButton, "Click On Email Button", 10);
	Thread.sleep(1000);

}

public void EnterEmail(String EnterEmail) throws InterruptedException {

	enterTextInTextbox(enterEmail, "Enter Email", EnterEmail, 10);
	Thread.sleep(1000);

}

public void ClickOnSend() throws InterruptedException {
	clickOnElement(ClickOnSend, "Click On Send", 10);  
 
  } 
}