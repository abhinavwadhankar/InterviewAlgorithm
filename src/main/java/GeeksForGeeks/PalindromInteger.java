package src.main.java.GeeksForGeeks;

public class PalindromInteger {
	
	public boolean palindronCheckInt(int value)
	{
		int original=value;
		int sum=0;
		boolean flag=false;
		while(value!=0)
		{
			int temp=value%10;
			sum=sum*10+temp;
			value=value/10;
		}
		if(original==sum)
		{
			flag=true;
		 System.out.println("Palindrom : "+original);
		 return flag;
		}
		System.out.println("It is not Palindrom : "+original);
		return flag;
	}
	
}
