package googleSearchExample;

import core.BaseSeleniumTest;
import org.testng.annotations.Test;

public class GoogleMainPage extends BaseSeleniumTest {


    @Test
    public void firstTest (){
        driver.get("http://google.com.ua ");
    }
}
