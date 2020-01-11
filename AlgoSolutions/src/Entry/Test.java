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
		
		/*Reverse Integer*/
		ReverseInteger rT=new ReverseInteger();
		rT.reverseInt(1234);
		rT.reverseInt(0);
		rT.reverseInt(1);
		rT.reverseInt(-1234);
		
		
		/*PalindromInteger */
		PalindromInteger pI=new PalindromInteger();
		pI.palindronCheckInt(121);
		pI.palindronCheckInt(-121);
		pI.palindronCheckInt(0);
		pI.palindronCheckInt(100);
		pI.palindronCheckInt(12345);
		
		
	}
	
	

}
