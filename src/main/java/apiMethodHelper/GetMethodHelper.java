package apiMethodHelper;

import apiConfigs.ApiPath;
import io.restassured.response.Response;
import utils.FileandEnv;

import java.io.File;

import static io.restassured.RestAssured.given;

public class GetMethodHelper {

    private static final String contentType = "application/json";
    private static final String accept = "*/*";
    static String url=FileandEnv.envAndFile().get("ServerUrl");
    public static Response getQuery1(String token) {
        Response response = given()
                .baseUri(url+ApiPath.apiPath.Get_Task)
              //  .queryParam(pathParamName, pathParamValue)
                .header("Authorization", "Bearer " + token)
                .contentType(contentType)
                .log().all()
                .when()
                .get().andReturn();
        System.out.println("------");
        response.then().log().all();
        return response;
    }
    public static Response getQuery2(String token,String pathParamName,String pathParamValue) {
        Response response = given()
                .baseUri(url+ApiPath.apiPath.Get_Task)
                .queryParam(pathParamName, pathParamValue)
                .header("Authorization", "Bearer " + token)
                .contentType(contentType)
                .log().all()
                .when()
                .get().andReturn();
        System.out.println("------");
        response.then().log().all();
        return response;
    }

}
