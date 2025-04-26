package testcase;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class ApiTest {
    String idvalue;

    @Test(priority = 1)
    public void getApi(){

        given()
                .when().get("https://api.restful-api.dev/objects")
                .then().statusCode(200).log().all();

    }
    @Test(priority = 2,dependsOnMethods = {"getApi"})
    public void postApi(){
        String requestBody="{\n" +
                "   \"name\": \"Apple MacBook Pro 16\",\n" +
                "   \"data\": {\n" +
                "      \"year\": 2019,\n" +
                "      \"price\": 1849.99,\n" +
                "      \"CPU model\": \"Intel Core i9\",\n" +
                "      \"Hard disk size\": \"1 TB\"\n" +
                "   }\n" +
                "}";
        HashMap databody= new HashMap();
        databody.put("year",2022);
        databody.put("price",200.222);
        databody.put("CPU model","Intel Core i9");
        databody.put("Hard disk size","1 TB");

        HashMap body = new HashMap();
        body.put("name","Gokul");
        body.put("data",databody);
        //given().header("Content-Type","application/json")
        Response response= (Response) given().header("Content-Type","application/json")
                .body(body)
                .when().post("https://api.restful-api.dev/objects")
                .then().statusCode(200).log().all().extract().response();
        idvalue= response.jsonPath().getString("id");
        System.out.println("Captured ID:"+ idvalue);
    }
    //@Test(priority = 3, dependsOnMethods = {"getApi"})
    public void deleteApi(){
        Response response=given()
                .when().delete("https://api.restful-api.dev/objects/6"+idvalue)
                .then().statusCode(200).log().all().extract().response();
        String mesage= response.jsonPath().getString("message");
        System.out.println("Captured Message:"+ mesage);
    }
}
