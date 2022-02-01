package class4;

import java.io.File;

import io.restassured.path.json.JsonPath;

public class GetNestedResponseBodyValue4 {

	public static void main(String[] args) {
		
		JsonPath jpath = new JsonPath(new File("response2.json"));
		
		
		String fn = jpath.get("data.first_name");
		System.out.println(fn);
		
		String ln = jpath.get("data.last_name");
		System.out.println(ln);
		
		String email = jpath.get("data.email");
		System.out.println(email);
		
		int id = jpath.get("data.id");
		System.out.println(id);
		
		String url = jpath.get("support.url");
		System.out.println(url);
		
		String text = jpath.get("support.text");
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
