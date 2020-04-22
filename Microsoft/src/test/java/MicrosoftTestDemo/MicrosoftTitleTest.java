package MicrosoftTestDemo;

import MicrosoftHomeDemo.MicrosoftHome;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MicrosoftTitleTest extends MicrosoftHome {

    @Test
    public void testTitle () {
        String title = driver.getTitle();
        System.out.println("Microsoft Title is: " + title);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title,"Microsoft - Official Home Page" ,
                "Title did not match check again");
        softAssert.assertAll();
    }
}
