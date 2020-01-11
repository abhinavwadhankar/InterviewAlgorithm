package src.Entry;


import src.problems.*;

public class Test {
	
	public static void main(String[] args) 
	{
		/*Swap Logic test*/
		SwapLogic sl = new SwapLogic();
		sl.swapbyAddSub(-2, 3);
		sl.swapbyBitwiseEXOR(2, 0);
		sl.swapbyMulDiv(5, 8);
		
		/*String Reverse*/
		StringReverse sr=new StringReverse();
		sr.stringReverseByCharArry("Abhinav");
		sr.stringReverseByStringBuffer("Abhinav");
		
	}
	
	

}
