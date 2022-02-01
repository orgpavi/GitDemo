package class7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.RestAssured;

public class ReqResCreateUser2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("response.json");
		
			RestAssured
				.given()
					.body(fis)
				.when()
					.post("https://reqres.in/api/users")
				.then()
					.statusCode(201);
		

	}

}
