package runner;
import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import pages.Deposit;
import pages.Withdraw;
import pages.homepage;
import utils.Screenshot;
import utils.Base;
import utils.EventHandler;
import utils.Reporter;
import utils.Screenshot;
public class Testcase2 extends Base {

    java.util.logging.Logger log =  LoggerHandler.getLogger();
    ExtentReports reporter = Reporter.generateExtentReport();;
    homepage Homepage = new homepage();
    Deposit deposit = new Deposit();

    
     @Test(priority = 2)
    public void TC_002() throws IOException {
            driver.get(prop.getProperty("url"));
            Homepage.Valid_Login_TC(driver);
            deposit.Deposit_Amount(driver);
        
        
    }

    
    

@BeforeMethod
public void beforeMethod() throws MalformedURLException {
    openBrowser();

}

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        reporter.flush();
        log.info("Browser closed");
        LoggerHandler.closeHandler();
    }
}

