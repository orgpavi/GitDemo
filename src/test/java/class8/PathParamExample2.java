package class8;

import io.restassured.RestAssured;

public class PathParamExample2 {

	public static void main(String[] args) {
		RestAssured
		.given()
			.pathParam("orgName", "orgpavi")
		.when()
			.log().all()
			.get("https://api.github.com/orgs/{orgName}/repos") //orgName --> Placeholder where the actual path param will be replaced
		.then()
			.log().all()
			.statusCode(200);

	}

}
