package class6;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.path.json.JsonPath;

public class JsonBodySizeValidation2 {

	public static void main(String[] args) {
		
		JsonPath jpath = new JsonPath(new File("response3.json"));
		int perPage = jpath.getInt("per_page");
		System.out.println(perPage);
		
		int dataArraySize = jpath.get("data.size()");
		System.out.println(dataArraySize);
		
		MatcherAssert.assertThat(dataArraySize, Matchers.equalTo(perPage));
	}

}
