package class4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.path.json.JsonPath;

public class GetResponseBodyValue3 {

	public static void main(String[] args) throws FileNotFoundException {
	
		
		//JsonPath jpath = new JsonPath(new FileInputStream("response.json"));
		
		JsonPath jpath = new JsonPath(new File("response.json"));
		
		String name = jpath.get("name"); //get() - accepts the key and returns the value
		System.out.println(name);
		
		String id = jpath.get("id");
		System.out.println(id);
		

	}

}
