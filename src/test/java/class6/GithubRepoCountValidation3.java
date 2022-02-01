package class6;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GithubRepoCountValidation3 {

	public static void main(String[] args) {
		
		Response res = RestAssured.get("https://api.github.com/orgs/orgpavi/repos");
		JsonPath jpath = res.jsonPath();
		
		int arraySize = jpath.get("size()");
		System.out.println(arraySize);
		
		MatcherAssert.assertThat(arraySize, Matchers.equalTo(11));
		

	}

}
