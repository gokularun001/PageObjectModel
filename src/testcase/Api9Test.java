package testcase;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class Api9Test {

    @Test
    void serial() throws JsonProcessingException {
        String jsonFormat = "{\n" +
                "  \"name\" : \"gokularunvijay\",\n" +
                "  \"color\" : \"automation tester\"\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();

        Api3Test go = mapper.readValue(jsonFormat, Api3Test.class);
        System.out.println(go.getColor());
        System.out.println(go.getName());
    }
}

