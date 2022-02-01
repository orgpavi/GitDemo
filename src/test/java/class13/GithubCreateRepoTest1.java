package class13;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GithubCreateRepoTest1 {

	public static void main(String[] args) {
		
		//File f = new File("repo.json");
		
		GithubRepoPojo obj= new GithubRepoPojo();
		obj.setName("repo_1236");
		obj.setDescription("This is repo_1236 created ");
		obj.setPrivateVal(true);
		
		Root r = RestAssured
			.given()
				.header("Authorization","Bearer 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")
				.contentType(ContentType.JSON)
				.body(obj)
			.when()
				.post("https://api.github.com/orgs/orgpavi/repos")
			.then()
				.log().body()
				.statusCode(201)
				.extract().as(Root.class);
		
	String desc =r.getDescription();
	String name = r.getName();
	
	String url = r.getOwner().getUrl();
	boolean p = r.getPermissions().isPull();
	
	System.out.println(desc);
	System.out.println(name);
	System.out.println(url);
	System.out.println(p);
		

	}

}
