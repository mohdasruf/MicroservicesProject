import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;


public class App{
	@Test
	public void test1(){
		expect().body("area",equalTo(100)).when().get("http://localhost:8081/customer?length=10&width=10");
	}
}
