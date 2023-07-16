package BaseTest;

import apiMethodHelper.GetMethodHelper;
import apiMethodHelper.PostMethodHelper;
import apiVerifications.APIVerification;
import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.ExtentReportListner;
import utils.GeneralUtil;

import java.io.IOException;

@Listeners(ExtentReportListner.class)
public class GetTaskAPI extends ExtentReportListner {
    String token;

    @BeforeTest
    public void login1() throws IOException {
        Response response = PostMethodHelper.post_login("inputs/Login.json");
        JsonNode jsonNode = GeneralUtil.extractnodevalue(response);
        token = jsonNode.get("token").asText();
        System.out.println(token);
    }

    @Test(description = "T709996")
    public void getTestCase1() {
        Response response = GetMethodHelper.getQuery1(token);
        APIVerification.responseCodeValiddation(response, 200);
    }

    @Test(description = "T709997")
    public void getTestCase2() {
        Response response = GetMethodHelper.getQuery2(token, "active", "false");
        APIVerification.responseCodeValiddation(response, 200);
    }

    @Test(description = "T709998")
    public void getTestCase3() {
        Response response = GetMethodHelper.getQuery2(token, "active", "true");
        System.out.println(response.getStatusCode());
        APIVerification.responseCodeValiddation(response, 200);
    }
}
