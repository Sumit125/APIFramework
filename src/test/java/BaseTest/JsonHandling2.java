package BaseTest;

import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.path.json.JsonPath;

public class JsonHandling2 {

    public static void main(String args[])
    {

    String text=Jsonclass.databody();
    JsonPath path=new JsonPath(text);
    String value= path.getString("labs[6].location");

       // JsonNode nodevalue=new JsonNode(text);
        System.out.println(value);
        String value2= path.getJsonObject("labs").toString();
        if(value2.contains("location"))
        {
            System.out.println("passed");
        }
        System.out.println(value2);
}}
