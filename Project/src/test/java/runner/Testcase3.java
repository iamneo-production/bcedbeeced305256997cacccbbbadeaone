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
public class Testcase3 extends Base {

    java.util.logging.Logger log =  LoggerHandler.getLogger();
    ExtentReports reporter = Reporter.generateExtentReport();;
    homepage Homepage = new homepage();
    Withdraw withdraw = new Withdraw(); 
    
    


    @Test(priority = 3)
    public void TC_003() throws IOException {
        
            ExtentTest test = reporter.createTest("WithdrawTest ", "Execution for WithdrawTest");
            driver.get(prop.getProperty("url"));
            Homepage.Valid_Login_TC(driver);
            withdraw.WithdrawTest(driver);
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

