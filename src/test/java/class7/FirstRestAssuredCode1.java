package class7;

import io.restassured.RestAssured;

public class FirstRestAssuredCode1 {

	public static void main(String[] args) {
		
		RestAssured
			.given()
			.when()
				.get("https://api.github.com/orgs/orgpavi/repos")
			.then()
				.statusCode(200);

	}

}
