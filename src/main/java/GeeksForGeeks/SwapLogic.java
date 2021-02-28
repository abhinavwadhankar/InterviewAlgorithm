package src.main.java.GeeksForGeeks;
import java.util.ArrayList;
import java.util.List;

public class SwapLogic {
	
	public List<Integer> swapbyBitwiseEXOR(int a, int b)
	{
		 System.out.println("Before swapbyBitwiseEXOR a:-"+a + "b:-"+b);
		 List<Integer> li=new ArrayList<Integer>();
		 a=a^b;
		 b=a^b;
		 a=a^b;

		 li.add(a);
		 li.add(b);
		 
		 System.out.println("After swapbyBitwiseEXOR a:-"+a + "b:-"+b);
		 
		 return li;
	}

	public List<Integer> swapbyMulDiv(int a, int b)
	{
		
		 System.out.println("Before swapbyMulDiv a:-"+a + "b:-"+b);
		 
		 List<Integer> li=new ArrayList<Integer>();
		 a=a*b;
		 b=a/b;
		 a=a/b;

		 li.add(a);
		 li.add(b);
	
		 System.out.println("After swapbyMulDiv a:-"+a + "b:-"+b);
		 
		 return li;
	}

	public List<Integer> swapbyAddSub(int a, int b)
	{
		System.out.println("Before swapbyAddSub a:-"+a + "b:-"+b);
		
		 List<Integer> li=new ArrayList<Integer>();
		 a=a+b;
		 b=a-b;
		 a=a-b;

		 li.add(a);
		 li.add(b);
		 
		 System.out.println("After swapbyAddSub a:-"+a + "b:-"+b);
		 
		 return li;
	}
	
}
