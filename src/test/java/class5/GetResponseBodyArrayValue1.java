/**
 * 
 */
package class5;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class GetResponseBodyArrayValue1 {

	
	public static void main(String[] args) {
		JsonPath jpath = new JsonPath(new File("response3.json"));
		
		//to fecth all the mail ids in the response 3 file under data array
		List<String> emailArray = jpath.getList("data.email");
		System.out.println(emailArray);
		
		//to fetch only specific value from the array inside response
		String email= jpath.get("data[0].email");
		System.out.println(email);

	}

}
