package testcase;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Api1Test {
    //@Test(priority = 1)
    public void getApi(){
        HashMap query = new HashMap<>();
        query.put("city","London");
        query.put("country","UK");

        //HashMap path = new HashMap<>();
        //path.put("common","get");
        Response repo = given().pathParams("common","get")
                //.pathParams(path)
                .queryParams(query)
                //.queryParams("city","London")
                //.queryParams("country","UK")
                .when().get("https://postman-echo.com/{common}")
                .then().statusCode(200)
                .cookie("sails.sid")
                .log().cookies().extract().response();
    }
    @Test
    public void getApi1(){
        Response resp=given()
                .when().get("https://www.google.com")
                .then().statusCode(200)
                .log().cookies().extract().response();
        Map<String,String>tvk = resp.cookies();
        Headers dmk=resp.getHeaders();
        //System.out.println(tvk.get("NID"));
        for (String x:tvk.keySet()){
            String thala=resp.getCookie(x);
            System.out.println(x+"-----"+thala);
        }
        for (Header y:dmk){
            System.out.println(y.getName()+"-------"+y.getValue());
        }
        System.out.println(resp.getCookie("AEC"));
        System.out.println(resp.getHeader("Content-Type"));
    }
}
