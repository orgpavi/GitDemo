package class4;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PrintingHeaders1 {

	public static void main(String[] args) {
		
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		//getHeaders() - returns all the headers 
		System.out.println(res.getHeaders());
		
		//getHeader() - returns particular header value, It accepts the key
		String str = res.getHeader("Content-Type");
		System.out.println(str);
		
		String server = res.getHeader("Server");
		System.out.println(server);
		
		
	}

}
