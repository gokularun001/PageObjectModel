package testcase;

import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Api6Test {

    @Test
    public void tester(){
        File f = new File("C:/Users/admin/IdeaProjects/pageobjectmodel/src/testcase/Api6Test.java");
        given()
                .multiPart("file",f)
                .contentType("application/json; charset=utf-8")
                .when().post("https://api.escuelajs.co/api/v1/files/upload")
                .then().statusCode(201).log().all();
    }
}
