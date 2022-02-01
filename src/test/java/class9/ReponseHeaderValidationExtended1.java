package class9;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class ReponseHeaderValidationExtended1 {

	public static void main(String[] args) {
		RestAssured
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
			.header("Server", Matchers.equalTo("GitHub.com"))
			.header("Content-Type", Matchers.equalTo("application/json; charset=utf-8"))
			.body("size()", Matchers.equalTo(10));
			
	}

}
