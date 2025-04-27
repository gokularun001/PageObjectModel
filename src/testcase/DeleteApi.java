package testcase;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteApi extends PojoApiTest {

    @Test
    void delete(ITestContext context){
        String id= context.getAttribute("id_value").toString();
        given().when().delete("http://localhost:3000/gokul/"+id).then().log().all();
    }
}
