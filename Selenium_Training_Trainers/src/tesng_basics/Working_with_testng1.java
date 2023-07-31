package tesng_basics;

import org.testng.annotations.Test;

public class Working_with_testng1 {

	@Test()
	public void SubsribeTest() {
		System.out.println("Executing Subscribe Test");
	}
	
	@Test(groups = "SmokeTest")
	public void VoteTest() {
		System.out.println("Executing Vote Test");
	}
}
