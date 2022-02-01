package class9;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

public class ResponseBodyValidationWithJsonPath3 {

	public static void main(String[] args) {
		JsonPath jpath = RestAssured
							.given()
								.pathParam("orgName", "orgpavi")
								.queryParam("type", "private")
								.header("Authorization", "Bearer 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")
							.when()
								.log().all()
								.get("https://api.github.com/orgs/{orgName}/repos") //orgName --> Placeholder where the actual path param will be replaced
							.then()
								.log().all()
								.statusCode(200)
								.extract().jsonPath();
		
		int reponseCount = jpath.get("size()");
		MatcherAssert.assertThat(reponseCount, Matchers.equalTo(10));
		


	}

}
