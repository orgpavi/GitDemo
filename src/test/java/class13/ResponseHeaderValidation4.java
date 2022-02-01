package class13;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

public class ResponseHeaderValidation4 {

	public static void main(String[] args) {
		
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		builder.expectHeader("Server", Matchers.equalTo("GitHub.com"));
		builder.expectHeader("Content-Type", Matchers.equalTo("application/json; charset=utf-8"));
		builder.expectBody("name", Matchers.equalTo("repo_1240"));
		
		RestAssured.responseSpecification =builder.build();

		
		GithubRepoPojo obj= new GithubRepoPojo();
		obj.setName("repo_1240");
		obj.setDescription("This is repo_12340 created ");
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
				.statusCode(201);
				

 

	}

}
