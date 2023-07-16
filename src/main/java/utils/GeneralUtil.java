package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.restassured.response.Response;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class GeneralUtil {

    public static JsonNode extractnodevalue(Response response) throws IOException {
        String jsonString = response.getBody().asString();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonString);
        return jsonNode;
    }
    public static Map<String,Object> updatepayload1(String Filepath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> addresss=objectMapper.readValue(new File(Filepath),new TypeReference<Map<String,Object>>(){});
        return addresss;
    }
}
