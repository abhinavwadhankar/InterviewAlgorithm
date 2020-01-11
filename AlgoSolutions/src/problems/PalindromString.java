package src.problems;

public class PalindromString {
	
	public void stringPalindromCheckByCharArray(String str)
	{
		System.out.println("Before :"+str);
		
		
		char[] ch=str.toCharArray();
		int length=ch.length;
		for(int i=0,j=length-1;i<length/2;i++,j--)
		{
			char chtemp=ch[i];
			ch[i]=ch[j];
			ch[j]=chtemp;
		}
		if(str.equals(new String(ch)))
			System.out.println("String is Palindrom: "+str);
		else
			System.out.println("String is not Palindrom: "+str);
	}
	
	public void stringPalindromCheckByStringBuffer(String str)
	{ 
		StringBuffer sb=new StringBuffer(str);
		
		if(str.equals(new String(sb.reverse())))
			System.out.println("String is Palindrom: "+str);
		else
			System.out.println("String is not Palindrom: "+str);
	}

	
}
