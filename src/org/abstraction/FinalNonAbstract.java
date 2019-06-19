package org.abstraction;

public class FinalNonAbstract extends Abstract2 {

	@Override
	public void Hardware()
	{
		System.out.println("Hardware is now in FinalNonAbstract");		
	}

	@Override
	public void programmer() 
	{
		System.out.println("Programmer is now in FinalNonAbstract");
	}
	
	@Override
	public void Software()
	{
		System.out.println("Software Details Abstract2 class definition - 2st Override ");
	}

	public static void main(String[] args) 
	{
		FinalNonAbstract fna = new FinalNonAbstract();
		fna.Software();
		
	}
	
}
