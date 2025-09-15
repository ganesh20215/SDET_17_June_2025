package apiautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PutRequest {

    @Test
    public void verifyPostAPIWithValidData(){
        SoftAssert sf = new SoftAssert();
        RestAssured.baseURI = "https://reqres.in/api/users/2";
        JSONObject obj = new JSONObject();
        obj.put("name", "Ganesh");
        obj.put("company", "Edso Services");
        obj.put("Address", "Pune, India");
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body(obj.toJSONString())
                .log().all()
                .when()
                .put()
                .then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertEquals(response.jsonPath().getString("name"), "Ganesh", "name should be Ganesh");
        sf.assertEquals(response.jsonPath().getString("company"), "Edso Services");
        sf.assertAll();
    }
}
