package src.main.java.GeeksForGeeks;
public class ReverseInteger {
	
	public void reverseInt(int value)
	{
		System.out.println("After reverse :-"+value);
		//int original=value;
		int sum=0;
		
		while(value!=0)
		{
			int temp=value%10;
			sum=sum*10+temp;
			value=value/10;
		}
		System.out.println("After reverse : "+sum);
	}

}
