package AppleTestDemo;

import AppleHome.AppleHomeDemo;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AppleTitleDemo extends AppleHomeDemo {

    @Test
    public void testTitle () {
        String title = driver.getTitle();
        System.out.println("Apple Title is: " + title);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title,"Apple", "Title did not match check again");
        softAssert.assertAll();
    }
}
