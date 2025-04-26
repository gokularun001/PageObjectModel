package testcase;

import org.testng.annotations.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class Api3Execute {

    @Test(priority = 1)
    public void getApi(){
//pojo
        Api3Test ap= new Api3Test();
        ap.setName("kumar");
        ap.setColor("red");

        Api3Test pa= new Api3Test();
        pa.setName("tamil");
        pa.setColor("orange");
        String page[]={"black","black"};
        pa.setColor(Arrays.toString(page));

        given()
                .body(ap)
                .when().post("http://localhost:3000/gokul")
                .then().log().all();
    }
}
