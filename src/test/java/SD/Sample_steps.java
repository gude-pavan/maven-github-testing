package SD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Sample_steps {
	
	@Given("Sample testcase1")
	public void sample_testcase1() {
	    System.out.println("===Executing testcase1===");
	}

	@And("Sample testcase2")
	public void sample_testcase2() {
		  System.out.println("===Executing testcase2===");
	}


}
