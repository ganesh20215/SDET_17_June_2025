package apiautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetRequestWithQueryParam {

    @Test
    public void verifyGetMethodWithQueryParam(){
        SoftAssert sf = new SoftAssert();
        RestAssured.baseURI = "https://reqres.in/api/users";
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .queryParam("page", "2")
                .log().all()
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertEquals(response.jsonPath().getString("data[0].id"), "7");
        sf.assertEquals(response.jsonPath().getString("data[0].email"), "michael.lawson@reqres.in");
        sf.assertEquals(response.jsonPath().getString("data[0].first_name"), "Michael");
        sf.assertEquals(response.jsonPath().getString("data[0].last_name"), "Lawson");
        sf.assertAll();
    }

}
