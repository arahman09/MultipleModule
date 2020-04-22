package EbayTestDemo;



import EbayHomeDemo.EbayHome;
import EbayHomeDemo.EbayProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class EbaySearchDemo extends EbayHome {


        @Test
        public void testSerchBox() throws InterruptedException {

            List<String> list = EbayProducts.getProducts();

            for (int i = 0; i<list.size(); i++){
                driver.findElement(By.cssSelector("#gh-ac")).clear();
                driver.findElement(By.id("gh-ac")).sendKeys(list.get(i), Keys.ENTER);
                Thread.sleep(3000);
            }
        }
    }

