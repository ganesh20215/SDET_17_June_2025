package apiautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DeleteRequest {

    @Test
    public void verifyDeleteAPIWithValidData(){
        SoftAssert sf = new SoftAssert();
        RestAssured.baseURI = "https://reqres.in/api/users/2";
        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .log().all()
                .when()
                .delete()
                .then().log().all()
                .statusCode(HttpStatus.SC_NO_CONTENT)
                .extract().response();
        sf.assertAll();
    }
}
