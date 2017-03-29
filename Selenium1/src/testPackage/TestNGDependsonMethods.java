package testPackage;

import org.testng.annotations.Test;

public class TestNGDependsonMethods {
	
	
	@Test
	public void testDepend1(){
		
		System.out.println("This is Method A");
		
}

	
	@Test(dependsOnMethods = "testDepend1")
	public void testDepend2(){
		
			System.out.println("This is Method B");
				
	}

}
