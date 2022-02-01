package class8;

import io.restassured.RestAssured;

public class BasicLogging1 {

	public static void main(String[] args) {
		
		RestAssured
			.given()
			.when()
				.log().all()
				.get("https://api.github.com/orgs/orgpavi/repos")
			.then()
				.log().all()
				.statusCode(200);

	}

}
