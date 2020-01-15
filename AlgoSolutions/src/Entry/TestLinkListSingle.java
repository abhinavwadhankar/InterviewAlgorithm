package src.Entry;

import src.problems.LinkListSingle;

public class TestLinkListSingle {

	public static void main(String str[])
	{
		LinkListSingle llS=new LinkListSingle();
		llS.insertAtFirst(10);
		llS.printLinkListAll();
		llS.insertAtFirst(20);
		llS.insertDataLast(50);
		
		llS.printLinkListAll();
		
		//Remove from last
		llS.removeDataLast();
		//Remove as per position.
		llS.removeSpecificPosition(0);
		llS.printLinkListAll();
		
	}
	
}
