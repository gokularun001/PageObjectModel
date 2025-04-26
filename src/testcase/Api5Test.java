package testcase;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Api5Test {
    @Test(priority = 1)
    public void getAPI(){

        Response res = (Response) given()
                .contentType(ContentType.JSON)
                .when().get("http://localhost:3000/gokul")
                .then().statusCode(200).log().all().extract().response();

        //Parse the response string as aJSON Array
        JSONArray jsonArray=new JSONArray(res.asString());
        //Print first 5 objects (0 to 4)
        for(int i=0;i<Math.min(5, jsonArray.length());i++){
            JSONObject obj =jsonArray.getJSONObject(i);
            System.out.println("Object"+i+":"+obj.toString());
            //System.out.println(obj.getString("Name"));
        }
    }
}
