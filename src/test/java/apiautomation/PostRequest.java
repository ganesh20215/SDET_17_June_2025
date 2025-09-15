package apiautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PostRequest {


    @Test
    public void verifyPostAPIWithValidData(){
        SoftAssert sf = new SoftAssert();
        RestAssured.baseURI = "https://reqres.in/api/users";
        JSONObject obj = new JSONObject();
        obj.put("name", "Ganesh");
        obj.put("company", "Edso Services");
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body(obj.toJSONString())
                .log().all()
                .when()
                .post()
                .then().log().all()
                .statusCode(HttpStatus.SC_CREATED)
                .extract().response();
        sf.assertEquals(response.jsonPath().getString("name"), "Ganesh", "name should be Ganesh");
        sf.assertEquals(response.jsonPath().getString("company"), "Edso Services");
        sf.assertNotNull(response.jsonPath().getString("id"), "Id should not be null");
        sf.assertAll();
    }
}
