package testcase;

import com.github.javafaker.Faker;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.oauth2;

public class Api10Test {
    @Test
    public void autherizat(){
        given()//.auth().preemptive().basic("postman","password")//basic/digest/preemption
                //.headers("Authorization","Bearer"+"fjfknijfnnk")
                //.auth().oauth("gokul","arun","vijay","hulk")
                //.auth().oauth2("gokul")
                //.queryParam("gokul","automatuion")
                .header("gokul","automation")
                .when().get("https://postman-echo.com/basic-auth")
                .then().log().all();

        Faker f = new Faker();
        System.out.println(f.name().fullName());
//        {
//            "gokul": [
//            {
//                "Name":"Arun",
//                "Color":"black"
//            },
//            {
//                "Name":"gokul",
//                "Color":["white"]
//            },
//            ]
//        }
 //       JSONObject ta = new JSONObject();
 //       String colorvalue=ta.getJSONArray("gokul").getJSONObject(1).getJSONArray("Color").get(1);
    }
}
