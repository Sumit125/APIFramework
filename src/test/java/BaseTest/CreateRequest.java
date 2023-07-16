package BaseTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CreateRequest {
    public static void main(String[] args) throws Exception {
        // create a new instance of ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // create a new JsonNodeFactory to create JsonNode instances
        JsonNodeFactory nodeFactory = JsonNodeFactory.instance;

        // create an empty ObjectNode
        ObjectNode objectNode = nodeFactory.objectNode();

        // add some key-value pairs to the ObjectNode
        objectNode.put("name", "John");
        objectNode.put("age", 30);
        objectNode.put("email", "john@example.com");

        // create an array of objects using an ArrayNode
        ArrayNode arrayNode = nodeFactory.arrayNode();
        ObjectNode person1 = nodeFactory.objectNode();
        person1.put("name", "Jane");
        person1.put("age", 25);
        person1.put("email", "jane@example.com");
        arrayNode.add(person1);

        ObjectNode person2 = nodeFactory.objectNode();
        person2.put("name", "Bob");
        person2.put("age", 40);
        person2.put("email", "bob@example.com");
        arrayNode.add(person2);

        // add the array to the ObjectNode
        objectNode.set("friends", arrayNode);

        // convert the ObjectNode to a JSON string
        String jsonString = objectMapper.writeValueAsString(objectNode);

        // print the JSON string
        System.out.println(jsonString);
    }
}