package BaseTest;

import com.relevantcodes.extentreports.LogStatus;
import io.restassured.path.json.JsonPath;
import org.json.JSONArray;
import org.json.JSONObject;

import static utils.ExtentReportListner.test;

public class JsonHandling {

    public static void main(String args[])
    {
       String text="{\"name\":\"John\", \"age\":30, \"car\":null}";
       String key="age";
        String key1="email12";
       String text1="{ \n" +
               "  \"accounting\" : [   \n" +
               "                     { \"firstName\" : \"John\",  \n" +
               "                       \"lastName\"  : \"Doe\",\n" +
               "                       \"age\"       : 23 },\n" +
               "\n" +
               "                     { \"firstName\" : \"Mary\",  \n" +
               "                       \"lastName\"  : \"Smith\",\n" +
               "                        \"age\"      : 32 }\n" +
               "                 ],                            \n" +
               "  \"sales\"      : [ \n" +
               "                     { \"firstName\" : \"Sally\", \n" +
               "                       \"lastName\"  : \"Green\",\n" +
               "                        \"age\"      : 27 },\n" +
               "\n" +
               "                     { \"firstName\" : \"Jim\",   \n" +
               "                       \"lastName\"  : \"Galley\",\n" +
               "                       \"age\"       : 41 }\n" +
               "                 ] \n" +
               "}  ";
        JsonPath js=new JsonPath(text1);
          int value=js.getInt("sales.size()");
          for(int i=0;i<value;i++)
          {
        String value1=js.get("sales["+i+"].firstName");
        if(value1.equals("Sally"))
        {
            String value2= js.get("x.problems[0].Diabetes[0].medications[0].medicationsClasses[0].className2[0].associatedDrug[0].strength");
            System.out.println(value2);
        }}

            /*if(json.has(key) && json.get(key)!= null) {
                System.out.println(json.get(key));
            }else {
                System.out.println("not present");
            }*/



    }}




