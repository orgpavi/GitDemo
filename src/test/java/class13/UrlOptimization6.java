package class13;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class UrlOptimization6 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://api.github.com";
		
		GithubRepoPojo obj= new GithubRepoPojo();
		obj.setName("repo_1241");
		obj.setDescription("This is repo_1241 created ");
		obj.setPrivateVal(true);
		
		RestAssured
			.given()
				.body(obj)
			.when()
				.post("orgs/orgpavi/repos")
			.then()
				.log().ifValidationFails()
				.statusCode(201)
				.body("name", Matchers.equalTo("repo_1241"));

	}

}
