package class3;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PrintingResponse1 {

	public static void main(String[] args) {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		
		//prints the response body
		res.print();
		
		//prints the response body - it also formats and prints it
		res.prettyPrint();
	}

}
