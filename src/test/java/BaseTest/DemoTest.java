package BaseTest;

import apiMethodHelper.GetMethodHelper;
import apiMethodHelper.PostMethodHelper;
import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import utils.GeneralUtil;

import java.io.IOException;

public class DemoTest extends BasicTest {
    String token;

/*    @Test
    public void login() throws IOException {
        GeneralUtil.updatepayload("inputs/Login.json","accountId","sumit");
        System.out.println("sumit"+token);
    }*/
    @BeforeTest
    public void login1() throws IOException {
        Response response= PostMethodHelper.post_login("inputs/Login.json");
        JsonNode jsonNode=GeneralUtil.extractnodevalue(response);
        token=jsonNode.get("token").asText();
        System.out.println(token);
    }
}