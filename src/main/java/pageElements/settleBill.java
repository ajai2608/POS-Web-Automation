package pageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebBase.WebBase;



public class settleBill extends WebBase{
	CreateDineInOrders CreateDineInOrders = new CreateDineInOrders();

	
	private By SettleBilldump = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[2]/button[2]/span");
	                                     //html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[1]/button[2]
	                                   
	                                    //		  /html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[2]/button[2]
	public void SettleBilldump()throws InterruptedException {
		clickOnElement(SettleBilldump, "Take Away", 10);
		Thread.sleep(3000);
	}
		
	
	int x=0;

	public void CompleteOrder() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(this.driver, 40);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("order-card-order-details-lc")));

	    // Below codes will give the list of item quantity
	    List<WebElement> quantityCollection = driver.findElements(By.className("order-card-order-details-lc"));
	    int length = quantityCollection.size();

	    for (int i = 0; i < quantityCollection.size(); i++) {
	        SettleBilldump();
	        Thread.sleep(1000);

	        CreateDineInOrders.SelectCash();
	        //Thread.sleep(1000);
	        CreateDineInOrders.SwipeComplete();
	        Thread.sleep(2000);
	    }
	}
  
		
	    }
	




