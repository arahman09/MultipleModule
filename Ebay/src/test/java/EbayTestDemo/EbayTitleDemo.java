package EbayTestDemo;

import EbayHomeDemo.EbayHome;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EbayTitleDemo extends EbayHome {


    @Test
    public void testTitle () {
        String title = driver.getTitle();
        System.out.println("Ebay Title is: " + title);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title,"Electronics, Cars, Fashion, Collectibles & More | eBay",
                "Title did not match check again");
        softAssert.assertAll();
    }

}
