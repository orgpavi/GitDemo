package class12;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GithubCreateRepoTest {

	public static void main(String[] args) {
		
		//File f = new File("repo.json");
		
		GithubCreateRepoPojo obj= new GithubCreateRepoPojo();
		obj.setName("repo_1235");
		obj.setDescription("This is repo_1235 created ");
		obj.setPrivateVal(true);
		
		RestAssured
			.given()
				.header("Authorization","Bearer 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")
				.contentType(ContentType.JSON)
				.body(obj)
			.when()
				.post("https://api.github.com/orgs/orgpavi/repos")
			.then()
				.log().body()
				.statusCode(201);
		

	}

}
