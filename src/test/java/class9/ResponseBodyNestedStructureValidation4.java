package class9;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class ResponseBodyNestedStructureValidation4 {

	public static void main(String[] args) {
		RestAssured
		.given()
			.pathParam("orgName", "orgpavi")
			.queryParam("type", "private")
			.queryParam("per_page", 2)
			.header("Authorization", "Bearer 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")
		.when()
			.log().all()
			.get("https://api.github.com/orgs/{orgName}/repos") //orgName --> Placeholder where the actual path param will be replaced
		.then()
			.log().all()
			.statusCode(200)
			.rootPath("owner[0]")
				.body("login", Matchers.equalTo("orgpavi"))
				.body("url", Matchers.equalTo("https://api.github.com/users/orgpavi"))
		
		//setting another rootPath
			.rootPath("permissions[0]")
				.body("admin", Matchers.equalTo(true))
		
		//Setting the parent as rootagain
		
				.rootPath("")
				.body("id", Matchers.equalTo("436722324"));//fails bcoz id value keeps changing
		
		
	}

}
