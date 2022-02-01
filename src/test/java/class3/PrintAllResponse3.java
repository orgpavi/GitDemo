package class3;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PrintAllResponse3 {

	public static void main(String[] args) {
		
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		//peek() - prints the statusline , headers and body of the response
		res.peek();
		//prettyPeek() -prints the statusline , headers and body of the response but formats the response body and prints
		res.prettyPeek();
	}

}
