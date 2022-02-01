package class5;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.path.json.JsonPath;

public class JsonBodyValidation2 {

	public static void main(String[] args) {
	
		JsonPath jpath = new JsonPath(new File("response.json"));
		String name = jpath.get("name");
		System.out.println(name);
		
		MatcherAssert.assertThat(name, Matchers.equalTo("postman"));
	

	}

}
