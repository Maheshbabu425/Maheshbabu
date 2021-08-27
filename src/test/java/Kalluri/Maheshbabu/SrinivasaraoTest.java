package Kalluri.Maheshbabu;

import org.testng.annotations.Test;

public class SrinivasaraoTest {

	private static final boolean flase = false;

	@Test
	public void wife()
	{
		System.out.println("Nirmala");
	}
	@Test
	public void son()
	{
		System.out.println("Nagaraju");
	}
	@Test
	public void grandSon()
	{
		System.out.println("Devansh");
	}
	
	@Test(enabled=flase)
	public void secondSon()
	{
		System.out.println("Mahesh");
	}
	
	@Test(timeOut=5000)
	public void smallSon()
	{
		System.out.println("Varun");
	}
	
	
}




