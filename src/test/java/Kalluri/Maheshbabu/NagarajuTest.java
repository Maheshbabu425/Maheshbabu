package Kalluri.Maheshbabu;

import org.testng.annotations.Test;

public class NagarajuTest {
	@Test
	public void wife()
	{
		System.out.println("Aparna");
	}
	@Test(dependsOnMethods= {"wife"})
	public void son()
	{
		System.out.println("Devansh");
	}
	
}
