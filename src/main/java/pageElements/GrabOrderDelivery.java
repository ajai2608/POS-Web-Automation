package pageElements;

import org.openqa.selenium.By;
import WebBase.WebBase;
import org.openqa.selenium.WebDriver;


public class GrabOrderDelivery extends WebBase {
	public static WebDriver driver;
	
	private By GrabIcon = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div[4]");
	private By GrabDeliveryIcon = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div[1]");
	private By GrabPickupIcon = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div[2]");
	private By PayRMButton = By.xpath("//button[@class='save ng-star-inserted']");
	//private By PayRMButton = By.xpath("//button[starts-with(normalize-space(text()), 'PAY RM')]\n"+ "");
	
			
	public void GrabIcon() throws InterruptedException {

		clickOnElement(GrabIcon, "Clicked on Grab Icon from Order Type Pop up", 10);
		Thread.sleep(1000);

	}

	public void GrabDeliveryIcon() throws InterruptedException {

		clickOnElement(GrabDeliveryIcon, "Clicked on Grab Delivery Icon", 10);
		Thread.sleep(1000);

	}
	public void GrabPickupIcon() throws InterruptedException {

		clickOnElement(GrabPickupIcon, "Clicked on Grab PickUp Icon", 10);
		Thread.sleep(1000);

	}
	public void PayRMButton() throws InterruptedException {

		clickOnElement(PayRMButton, "PayRMButton", 10);
		Thread.sleep(2500);

	}
}
