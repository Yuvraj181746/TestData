package Academy;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class HomePage extends Base {
	
	@BeforeClass
	@AfterClass
	@Test
	public void basePageNavigation() throws IOException 
	{
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		
	}

	
}
