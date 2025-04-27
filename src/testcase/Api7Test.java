package testcase;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Api7Test {
    @Test
    public void testschema(){
        //json schema validation
        given()
                .when().get("https://api.restful-api.dev/objects/1")
                .then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
    }
}
