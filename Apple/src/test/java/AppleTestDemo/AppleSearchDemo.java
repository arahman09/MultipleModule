package AppleTestDemo;

import AppleHome.AppleHomeDemo;
import AppleHome.AppleProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class AppleSearchDemo extends AppleHomeDemo {

    @Test
    public void testSearchBox() throws InterruptedException {

        List<String> list = AppleProducts.getProducts();


        for (int i = 0; i < list.size(); i++) {
            driver.findElement(By.id("ac-gn-link-search")).click();
            driver.findElement(By.cssSelector("#ac-gn-searchform-input")).clear();
            driver.findElement(By.id("ac-gn-searchform-input")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(3000);
        }
    }
}