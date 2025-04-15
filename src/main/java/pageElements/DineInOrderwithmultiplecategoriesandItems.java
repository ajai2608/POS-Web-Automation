package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import WebBase.WebBase;



public class DineInOrderwithmultiplecategoriesandItems extends WebBase {
	
	
	String[] strings = {"//*[@id=\"307767ee450b414b80782fb3a5920189\"]/div", "//*[@id=\"3d21e37c18ad4e7a9be51175866af835\"]/div[1]", "//*[@id=\"66bfa2682a69417abe90e2f1302bd5d5\"]/div[1]/div", "//*[@id=\"5b971cc9d2ac4dd283e9e876e8ecc3ba\"]/div[1]", "//*[@id=\"58136971f3324491aac10fd1da441dbc\"]/div[1]", "//*[@id=\"fd9f221a661b3e07371ea057e041f80f3c0528f5bd25fa443cc89d2e043cdc9c\"]/div[1]/div", "//*[@id=\"f8f445d157f6fb2fc8d1c55a0241eedf3fe2bc73726bc77213b004cdf98ed1ef\"]/div", "//*[@id=\"c9ddb086298771e48cfbcbea78413e73c963eae584de44b7153331a9c1ee3464\"]/div[1]/div", "//*[@id=\"fa6ba14ed4225a71d9a0f8de8615445787d952d644b21a01ed1ef5a315f14885\"]/div[1]/div"};
	                 
	

int x=0;

public void clickOnItemNames() {
    try {
        // Find the parent container element
        WebElement parentContainer = driver.findElement(By.className("wrapper"));

        // Wait for the child containers to be present
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'ng-star-inserted')]")));
        																

        // Find all child containers within the parent container
        List<WebElement> childContainers = parentContainer.findElements(By.xpath(".//div[contains(@class, 'ng-star-inserted')]"));
        System.out.println("Child Containers: " + childContainers);

        // Iterate over each child container
        for (WebElement childContainer : childContainers) {
            try {
                // Find all the items within the current child container
                List<WebElement> items = childContainer.findElements(By.xpath("//div[contains(@class, 'ng-star-inserted')]"));

                // Check if items are present in the child container
                if (!items.isEmpty()) {
                    // Click on the first item in the list
                    items.get(0).click();
                    
                    // Ensure x is within the bounds of the strings array
                    if (x < strings.length) {
                        clickOnElement(By.xpath(strings[x]), "Clicked on Items", 10);
                        x++;
                    } else {
                        System.out.println("Index out of bounds: x=" + x + ", strings.length=" + strings.length);
                        // Handle the out-of-bounds index appropriately
                    }

                    System.out.println("Clicked on an item in the child container");
                } else {
                    System.out.println("No items found in the child container");
                }
            } catch (StaleElementReferenceException e) {
                // Handle stale element reference exception
                System.out.println("Stale element reference exception occurred, retrying...");
                continue; // Continue to the next iteration
            }
        }
        System.out.println("Clicked on item names");
    } catch (NoSuchElementException e) {
        System.out.println("Unable to click on item names: " + e.getMessage());
    }
}

	
}

