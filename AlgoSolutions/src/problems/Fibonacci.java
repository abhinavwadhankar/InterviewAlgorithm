package src.problems;

public class Fibonacci {
	
	public void fibonacciSeries(int numb)
	{
		int fiboFirst=0;
		int fiboSecond=1;
		
		if(numb==1)
		{
			System.out.print("first No:"+fiboFirst);
		}
		else if(numb==2)
		{
			System.out.print("first No:"+fiboFirst);
			System.out.print(" Second No:"+fiboSecond);	
		}
		else if(numb>2)
		{
			 
			
			System.out.print(" "+fiboFirst);
			System.out.print(" "+fiboSecond);	
			
			for(int i=3;i<=numb;i++)
			{
				int fiboThird=fiboFirst+fiboSecond;
				System.out.print(" "+fiboThird);	
				fiboFirst=fiboSecond;
				fiboSecond=fiboThird;
			}
			System.out.println();
		}
	}
	public void fiboRecursion(int numb)
	{
		for(int i=0;i<numb;i++)
		{
		  System.out.print(fibonacciRecussion(i)+" ");
		} 
	}
	
	private int fibonacciRecussion(int n)
	{
		if(n==0)
		return 0;
		if(n==1 || n==2)
		 return 1;
		
		 return fibonacciRecussion(n-2)+ fibonacciRecussion(n-1);
		 
		 
	}

}
