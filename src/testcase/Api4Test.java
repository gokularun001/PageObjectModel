package testcase;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Api4Test {

    @Test
    public void extractFromElement() {
        // Send GET request to the XML endpoint
        Response response = RestAssured
                .given()
                .when()
                .get("https://www.w3schools.com/xml/note.xml");

        // Parse the XML response
        XmlPath xmlPath = new XmlPath(response.asString());

        // Extract the <from> element
        String fromValue = xmlPath.getString("note.from");

        // Print the extracted value
        System.out.println("From: " + fromValue);
    }
}
