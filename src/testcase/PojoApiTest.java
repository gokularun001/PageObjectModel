package testcase;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PojoApiTest {
    //String id;
    @Test
    void change(ITestContext context) {
        HashMap tm = new HashMap();
        tm.put("Name", "thor");
        tm.put("Color", "silver");

        String id = given().headers("Accept","*/*")
                //body(tm)
                .when().post("http://localhost:3000/gokul").jsonPath().get("id");
        context.getSuite().setAttribute("id_value",id);
        context.getSuite().setAttribute("gokul","automation");
        System.out.println(id);
    }
}
