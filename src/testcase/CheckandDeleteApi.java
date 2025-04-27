package testcase;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CheckandDeleteApi {
    @Test
    void check(){
        HashMap ktm= new HashMap();
        ktm.put("Name","tony");
        ktm.put("Color","gold");

        String id = given().
                body(ktm)
                .when().post("http://localhost:3000/gokul").jsonPath().get("id");
        System.out.println(id);

        given().when().delete("http://localhost:3000/gokul/"+id).then().log().all();
    }
}
