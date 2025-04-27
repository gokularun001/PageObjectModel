package testcase;

import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Api8Test {
    @Test
    public void testschema(){
        //xml schema validation
        given()
                .when().get("https://www.w3schools.com/xml/note.xml")
                .then().assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("xmlschema.xsd"));
    }
}
