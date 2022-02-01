package class11;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class NestedJsonDeserialization1 {

	public static void main(String[] args) {
		Root root = RestAssured
				.given()
				.when()
					.get("https://reqres.in/api/users/2")
				.then()
					.log().body()
					.statusCode(200)
					.extract().as(Root.class);
		
		Data dataobj = root.getData();
		String email = dataobj.getEmail();
		System.out.println(email);
		MatcherAssert.assertThat(email, Matchers.equalTo("janet.weaver@reqres.in"));

	}

}
