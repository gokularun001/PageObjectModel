package testcase;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static api.Implementation.createUser;
import static api.Implementation.getUser;
import static api.Payload.createBody;

public class TestingApi {
    @Test
    public void test(){
        Response response=getUser();
        response.then().statusCode(200).log().all();
        Assert.assertEquals(response.statusCode(),200);

        Response response1=createUser(createBody());
        response1.then().log().all();
    }
}
