package api;

import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Implementation {

    public static Response getUser(){
        Response res =given().when().get(DeclaringUrl.base_url);
        return res;
    }
    public static Response createUser(HashMap pay){
        Response resp = given().body(pay).when().post(DeclaringUrl.base_url);
        return resp;
    }
}
