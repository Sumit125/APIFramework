package BaseTest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.ExtentReportListner;
import utils.FileandEnv;
@Listeners(ExtentReportListner.class)
public class BasicTest extends ExtentReportListner {
    public void utilTest()
    {
        test.log(LogStatus.INFO,"Test is start");
        test.log(LogStatus.PASS,"Test is passed");
       // test.log(LogStatus.FAIL,"Test is failed");
        test.log(LogStatus.PASS,"Test is passed");
        System.out.println(FileandEnv.envAndFile());
    }
}