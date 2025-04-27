package testcase;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Api2Test {
    String idvalue;
    @Test
    public void postApi(){
//        //String
//        String requestBody="{\n" +
//                "   \"name\": \"Apple MacBook Pro 16\",\n" +
//                "   \"data\": {\n" +
//                "      \"year\": 2019,\n" +
//                "      \"price\": 1849.99,\n" +
//                "      \"CPU model\": \"Intel Core i9\",\n" +
//                "      \"Hard disk size\": \"1 TB\"\n" +
//                "   }\n" +
//                "}";
//        //Hashmap
//        HashMap databody= new HashMap();
//        databody.put("year",2022);
//        databody.put("price",200.222);
//        databody.put("CPU model","Intel Core i9");
//        databody.put("Hard disk size","1 TB");
//
//        HashMap body = new HashMap();
//        body.put("name","Gokul");
//        body.put("data",databody);
        //given().header("Content-Type","application/json")
        //file path
       //File king = new File("C:/Users/admin/IdeaProjects/pageobjectmodel/src/postbody.json");
        //4 method

        JSONObject trip= new JSONObject();
        trip.put("name","gokul");
        JSONObject trick= new JSONObject();
        trick.put("year","2022");
        trick.put("price","500.564");
        trick.put("CPU model","Intel Core i9");

        trip.put("data",trick);
        Response response= (Response) given().header("Content-Type","application/json")
                .body(trip.toString())
                .pathParam("hero","objects")
                .when().post("https://api.restful-api.dev/{hero}")
                .then().statusCode(200).log().all().extract().response();
        idvalue= response.jsonPath().getString("id");
        System.out.println("Captured ID:"+ idvalue);
    }
}
