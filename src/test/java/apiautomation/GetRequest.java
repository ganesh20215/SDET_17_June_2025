package apiautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetRequest {

    //RestAssured : Used for configure and initialized API Request
    //Response : It represent the HTTP response return by server


    @Test
    public void verifyGetMethod(){
        System.out.println("Hello People..");
        SoftAssert sf = new SoftAssert();
        RestAssured.baseURI = "https://reqres.in/api/users";
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .log().all()
                .when()
                .get("/2")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertEquals(response.jsonPath().getString("data.id"), "2");
        sf.assertEquals(response.jsonPath().getString("data.email"), "janet.weaver@reqres.in");
        sf.assertEquals(response.jsonPath().getString("data.first_name"), "Janet");
        sf.assertEquals(response.jsonPath().getString("data.last_name"), "Weaver");
        sf.assertAll();
    }

}
