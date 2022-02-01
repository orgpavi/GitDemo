package class10;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ReqResPost1 {

	public static void main(String[] args) {
		
		File inputJson = new File("reqresinput.json");
		Root obj = RestAssured
			.given()
				.contentType(ContentType.JSON)
				.body(inputJson)
			.when()
				.post("https://reqres.in/api/users")
			.then()
				.log().all()
				.statusCode(201)
				.extract().as(Root.class);
		
		String id = obj.getId();
		System.out.println(id);
		
		String name = obj.getName();
		MatcherAssert.assertThat("name", Matchers.equalTo("Adam"));

	}

}
