package apiMethodHelper;

import apiConfigs.ApiPath;
import io.restassured.response.Response;
import utils.FileandEnv;

import java.io.File;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PostMethodHelper {
    private static final String contentType = "application/json";
    private static final String accept = "*/*";
    static String url= FileandEnv.envAndFile().get("ServerUrl");
    public static Response post_login(String requestFilePath) {
        String urlwithpath= (url+ ApiPath.apiPath.Login);
        Response response = given()
                .baseUri(urlwithpath)
                .body(new File(requestFilePath))
                .contentType(contentType)
                .accept(accept)
                .log().all()
                .when()
                .post().andReturn();
        System.out.println("------");
        response.then().log().all();
        System.out.println(response.getBody().asString());
        return response;
    }
    public static Response postQuery1(Map<String,Object> requestpayload, String token) {
        String urlwithpath= (url+ ApiPath.apiPath.Add_Task);
        Response response = given()
                .baseUri(urlwithpath)
                .header("Authorization", "Bearer " + token)
                .body(requestpayload)
                .contentType(contentType)
                .accept(accept)
                .log().all()
                .when()
                .post().andReturn();
        System.out.println("------");
        response.then().log().all();
        return response;
    }
}
