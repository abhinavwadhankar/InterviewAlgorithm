package src.problems;

public class StringReverse {
	
	public void stringReverseByCharArry(String str)
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
		System.out.println("After :"+ new String(ch));
	}
	
	public void stringReverseByStringBuffer(String str)
	{
		System.out.println("Before :"+str);
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println("After :"+sb);
	}

}
