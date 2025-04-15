package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class CashDrawerOpenCashier extends WebBase {

	public static WebDriver driver;

	private By CashDrawer = By.xpath("//img[contains(@src, 'cash-drawer-icon.svg')]\n"
			+ "");
	private By Opencashier = By.xpath ("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-open-drawer/div/div[2]/div/div/div[1]");
	private By ContinueButton = By.xpath ("/html/body/div[1]/div[5]/div/mat-dialog-container/div/div/app-cashier-confirmation/div/div[2]/div[2]/div/button[2]");
	private By enterusername= By.xpath ("//input[@formcontrolname='staff_name']\n"
			+ "");
	private By enteramount = By.xpath("//input[@formcontrolname='amount']\n"
			+ "");
	//private By donebutton = By.xpath("/html/body/div[1]/div[5]/div/mat-dialog-container/div/div/app-update-cashier/div/div/div[3]/button");
	private By donebutton = By.xpath("/html/body/div[1]/div[5]/div/mat-dialog-container/div/div/app-update-cashier/div/div[3]/button");
	
	// Constructor if needed


	public void CashDrawer() throws InterruptedException {
		clickOnElement(CashDrawer, "Cash Drawer Cash In", 10);
		Thread.sleep(1000);

	}
	public void Opencashier() throws InterruptedException {
		clickOnElement(Opencashier, "Open cashier", 10);
		Thread.sleep(1000);

	}  

	public void ContinueButton() throws InterruptedException {
		clickOnElement(ContinueButton, "Continue Button", 10);
	}

	public void enterusername(String username) throws InterruptedException {
		enterTextInTextbox(enterusername, "enter user name", username, 10);
		Thread.sleep(2000);
	}

	public void enteramount(String amount) throws InterruptedException {
		enterTextInTextbox(enteramount, "enter amount", amount, 10);  
	}     
	public void donebutton() throws InterruptedException {
		clickOnElement(donebutton, "done button", 10);   
		Thread.sleep(2000);


	}
}
