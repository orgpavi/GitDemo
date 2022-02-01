package class13;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

public class RequestSpecificationBuilder5 {

	public static void main(String[] args) {
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.addHeader("Authorization","Bearer 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");
		builder.setContentType(ContentType.JSON);
		
		RestAssured.requestSpecification = builder.build();
		
		
		GithubRepoPojo obj= new GithubRepoPojo();
		obj.setName("repo_1239");
		obj.setDescription("This is repo_1239 created ");
		obj.setPrivateVal(true);
		
		RestAssured
			.given()
				.body(obj)
			.when()
				.post("https://api.github.com/orgs/orgpavi/repos")
			.then()
				.log().ifValidationFails()
				.statusCode(201)
				.body("name", Matchers.equalTo("repo_1237"));
	}

}
