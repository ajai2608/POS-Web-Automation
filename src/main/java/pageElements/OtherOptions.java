package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;
import io.cucumber.java.en.When;

public class OtherOptions extends WebBase  {
	

		public static WebDriver driver;

		private By OtherOrderType = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div[3]");
		private By OtherDeliveryOrderType = By.xpath("//div[contains(@class, 'order-card') and .//p[normalize-space(text())='Others Delivery']]\n"
				+ "");
		

		public void OtherOrderType () throws InterruptedException {

			clickOnElement(OtherOrderType, "Other Order Type from Pop up", 10);
}
		
		public void OtherDeliveryOrderType () throws InterruptedException {

			clickOnElement(OtherDeliveryOrderType, "Other Delivery Order Type", 10);
}
}