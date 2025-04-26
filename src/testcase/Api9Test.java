package testcase;

import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import org.testng.annotations.Test;

public class Api9Test {
    @Test
    public void serial() {
        String jsonFormat = "{\n" +
                "  \"name\" : \"gokularunvijay\",\n" +
                "  \"color\" : \"automation tester\"\n" +
                "}";

        ObjectMapper gk = new ObjectMapper() {
            @Override
            public Object deserialize(ObjectMapperDeserializationContext objectMapperDeserializationContext) {
                return null;
            }

            @Override
            public Object serialize(ObjectMapperSerializationContext objectMapperSerializationContext) {
                return null;
            }
        };
        Api3Test ak = gk.equals(jsonFormat, Api3Test.class);

        System.out.println(ak.getColor());
        System.out.println(ak.getName());
    }
}