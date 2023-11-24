package googleSearchExample;

import core.BaseSeleniumTest;
import jdk.jfr.Description;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;
import static org.testng.TestRunner.PriorityWeight.priority;

//import static java.awt.GraphicsEnvironment.headless;

public class GooglePageTests extends BaseSeleniumTest {



    @Test ()
    @Description("First test")
    @CustomAttribute(name = "Taras ")
        public void firstTest (){
        MainPage mainPage = new MainPage();
        mainPage.openMainPage();
        Assert.assertEquals(mainPage.getTitlePage(),"Google");

    }

    @Test(priority = 1)
    public void searchSomethingTest(){
        MainPage mainPage = new MainPage();
        mainPage.searchSomething("Selenium");
       Assert.assertTrue(mainPage.getUrlPage().contains("search"));
    }


    @Test (priority = 2)
    public void searchResultTest(){
    SearchPage searchPage = new SearchPage();
    Assert.assertTrue(searchPage.setSearchResults()>1000);
    }
}
