package BaseTest;

import apiMethodHelper.PostMethodHelper;
import apiVerifications.APIVerification;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.ExtentReportListner;
import utils.GeneralUtil;

import java.io.IOException;
import java.util.Map;

@Listeners(ExtentReportListner.class)
public class AddTaskAPI extends ExtentReportListner {
    String token;
    ObjectMapper objectMapper = new ObjectMapper();
    @BeforeTest
    public void login1() throws IOException {
        Response response= PostMethodHelper.post_login("inputs/Login.json");
        JsonNode jsonNode= GeneralUtil.extractnodevalue(response);
        token=jsonNode.get("token").asText();
        System.out.println(token);
    }
    @Test
    public void addTask1() throws IOException {
        Map<String,Object> addresss=GeneralUtil.updatepayload1("inputs/AddTask.json");
        addresss.put("taskID", "new value 292");
        addresss.put("name", "new value 292");
        Response response=PostMethodHelper.postQuery1(addresss,token);
        APIVerification.responseCodeValiddation(response,200);
    }
    @Test
    public void addTask2() throws IOException {
        Map<String,Object> addresss=GeneralUtil.updatepayload1("inputs/AddTask.json");
        addresss.put("taskID", "new value 292");
        addresss.put("name", "new value 292");
        Response response=PostMethodHelper.postQuery1(addresss,token);
        APIVerification.responseCodeValiddation(response,200);
    }
}
