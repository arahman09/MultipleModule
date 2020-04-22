package MicrosoftTestDemo;

import MicrosoftHomeDemo.MicrosoftHome;
import MicrosoftHomeDemo.MicrosoftProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class MicrosoftSearchTest extends MicrosoftHome {

    @Test
    public void testSearchBox() throws InterruptedException {

        List<String> list = MicrosoftProducts.getProducts();
        driver.findElement(By.id("search")).click();
        for (int i = 0; i<list.size(); i++){
            //driver.findElement(By.id("search")).click();
            driver.findElement(By.cssSelector("#cli_shellHeaderSearchInput")).clear();
            driver.findElement(By.id("cli_shellHeaderSearchInput")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(5000);
        }
    }
}

