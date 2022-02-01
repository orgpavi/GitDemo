package class3;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PrintingStatusCode2 {

	public static void main(String[] args) {
		
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		
		//getStatusCode() - gets the status code value from the response and return type is int
		int statusCode = res.getStatusCode();
		System.out.println(statusCode);
		
		
		//getStatusLine() - Returns the status code and the corresponding message
		String statusLine = res.getStatusLine();
		System.out.println(statusLine);
		
		
		

	}

}
