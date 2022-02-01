package class13;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class LoggingOnError2 {

	public static void main(String[] args) {

		GithubRepoPojo obj= new GithubRepoPojo();
		obj.setName("repo_1236");
		obj.setDescription("This is repo_1236 created ");
		obj.setPrivateVal(true);
		
		RestAssured
			.given()
				.header("Authorization","Bearer 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")
				.contentType(ContentType.JSON)
				.body(obj)
			.when()
				.post("https://api.github.com/orgs/orgpavi/repos")
			.then()
				.log().ifError()
				.statusCode(201);

	}

}
