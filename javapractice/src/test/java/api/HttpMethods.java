package api;


import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.parsing.Parser;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.response.ResponseBodyData;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;
import org.junit.Test;

public class HttpMethods {

    private final static String BASE_URL = "http://red.maxcode.net";
    private final static String CLOCKS_PATH = "/api/clocks/";

    public static Response doGetRequest;

    private final static String X_TOKEN = "x-token";
    private final static String TOKEN_VALUE = "22682e86-15ca-439e-9fd2-caa699058493";

    private static RequestSpecification requestSpecification;

    // TODO: 28/08/2018 2 POST request
    // TODO: Update first post request
    //TODO: Delete second post request


    /**
     * Method to create request specification
     *
     * It will executes before each test
     */
    @BeforeClass
    public static void createRequestSpecification() {
        requestSpecification =
                new RequestSpecBuilder().
                        setBaseUri(BASE_URL).
                        setBasePath(CLOCKS_PATH).
                        build();
    }

    /**
     * POST request to create a new clock alarm
     */
    @Test
    public void PostFirstClock() {
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("label", "First Clock");
        properties.put("hour", "21");
        properties.put("minutes", "34");
        properties.put("enabled", "true");
        properties.put("token", "3a830f60-3ecf-439f-9e11-dc7fc92e0871");

        given()
                .header(X_TOKEN, TOKEN_VALUE)
                .contentType("application/json")
                .baseUri(BASE_URL)
                .body(properties)
                .when()
                .post(CLOCKS_PATH)
                .then()
                .statusCode(200);
    }

    /**
     * POST request to create second clock alarm
     */
    @Test
    public void PostSecondClock() {
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("label", "Second Clock");
        properties.put("hour", "22");
        properties.put("minutes", "35");
        properties.put("enabled", "false");
        properties.put("token", "3a830f60-3ecf-439f-9e11-dc7fc92e0871");

        given()
                .header(X_TOKEN, TOKEN_VALUE)
                .contentType("application/json")
                .baseUri(BASE_URL)
                .body(properties)
                .when()
                .post(CLOCKS_PATH)
                .then()
                .statusCode(200);
    }

    /**
     * GET request to retrieve all clocks alarm
     */
    @Test
    public void GetAllClocksFromApi() {

        RestAssured.defaultParser = Parser.JSON;
        Response response =
                (Response) RestAssured.given().
                       header(X_TOKEN, TOKEN_VALUE, "Content-Type", ContentType.JSON, "Accept", ContentType.JSON)
                       .when()
                       .get(BASE_URL + CLOCKS_PATH)
                       .then()
                       .contentType(ContentType.JSON).extract().response()
                       .then()
                       .assertThat()
                       .statusCode(401);

        System.out.println(response.prettyPrint());
    }

    @Test
    public void UpdateFirstPostClock() {

        Map<String, String> properties = new HashMap<String, String>();
        properties.put("id", "2");

        given()
                .header(X_TOKEN, TOKEN_VALUE)
                .contentType("application/json")
                .baseUri(BASE_URL)
                .body(properties)
                .when()
                .post(CLOCKS_PATH)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void DeleteAllClocksFromApi() {

        Map<String, String> properties = new HashMap<String, String>();
        properties.put("id", "2");
        properties.put("label", "Test");
        properties.put("hour", "21");
        properties.put("minutes", "34");
        properties.put("enabled", "true");

        given()

                .header(X_TOKEN, TOKEN_VALUE)
                .contentType("application/json")
                .baseUri(BASE_URL);

        Response response = given()
                .body(properties)
                .delete(BASE_URL + CLOCKS_PATH + "/" + "10");

        response
                .then()
                .statusCode(200);
    }
}
