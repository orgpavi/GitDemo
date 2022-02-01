package class5;

import java.io.File;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.path.json.JsonPath;

public class JsonBodyValidationHamcrest3 {

	public static void main(String[] args) {
		
		JsonPath jpath = new JsonPath(new File("response3.json"));
		List<String> firstNames = jpath.getList("data.first_name");
		System.out.println(firstNames);
		
		//to check any one of the items exists in an array/Collection
		MatcherAssert.assertThat(firstNames, Matchers.hasItem("Lindsay"));
		
		//to check whether all the items are exists in the array/Collection
		//Contains() - Array should have same number of items and in the same order
		MatcherAssert.assertThat(firstNames, Matchers.contains("Michael","Lindsay", "Tobias", "Byron", "George", "Rachel"));
		System.out.println("Compared using Contains()");
		
		//to check forthe items in any order we can use containsInAnyOrder()
		MatcherAssert.assertThat(firstNames, Matchers.containsInAnyOrder("Lindsay", "Tobias", "Byron", "Michael","George", "Rachel"));
		System.out.println("Compared using containsInAnyOrder()");
	}

}
