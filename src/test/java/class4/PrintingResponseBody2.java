package class4;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PrintingResponseBody2 {

	public static void main(String[] args) {
	
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		
		

	}

}
