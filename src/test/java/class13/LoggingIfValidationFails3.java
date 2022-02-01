package class13;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class LoggingIfValidationFails3 {

	public static void main(String[] args) {
		GithubRepoPojo obj= new GithubRepoPojo();
		obj.setName("repo_1238");
		obj.setDescription("This is repo_1238 created ");
		obj.setPrivateVal(true);
		
		RestAssured
			.given()
				.header("Authorization","Bearer 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")
				.contentType(ContentType.JSON)
				.body(obj)
			.when()
				.post("https://api.github.com/orgs/orgpavi/repos")
			.then()
				.log().ifValidationFails()
				.statusCode(201)
				.body("name", Matchers.equalTo("repo_1237"));

	}

}
