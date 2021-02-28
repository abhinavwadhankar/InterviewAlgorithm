package src.main.java.GeeksForGeeks;

public class LinkListSingle {
	
	
	public Node head;
	
	class Node
	{
		public int data;
		public Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void insertDataLast(int data)
	{
		Node newNode=new Node(data);
		 //check if LinkListSingle is empty
		if(head==null)
		  insertAtFirst(data);
		else
		{
			Node currentNode=head;
			while(currentNode.next!=null)
			{
				currentNode=currentNode.next;
			}
			currentNode.next=newNode;
		}	
	}
	public void printLinkListAll()
	{
		Node currentNode=head;
		if(head==null)
		{
			System.out.println("Empty LinkList");
		}
		else
		{
			while(currentNode!=null)
			{
				System.out.print(currentNode.data+" ");
				currentNode=currentNode.next;
			}
			System.out.println();
		}
	}
	
	public void removeDataLast()
	{
	  //check if LinkListSingle is empty
		Node node=head;
		if(node==null)
		{
			System.out.println("LinkListSingle is empty");
		}
		else
		{
			Node currentNode=head;
			Node previousNode=head;
			while(currentNode.next!=null)
			{
				previousNode=currentNode;
				currentNode=currentNode.next;
			}
			previousNode.next=null;
		}	
	}
	public void insertAtFirst(int data)
	{
		
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		

	}
	public void removeSpecificPosition(int position)
	{
		
	  Node node=head;
		
		if(head==null)
		{
			System.out.println("LinkListSingle is empty");
		}
		else if (position==0)
		{
			head=node.next;
		}
		else if(position>0)
		{
		 
			for(int i=1;i<position-1 && head!=null;i++ )
			{
			  node=node.next;
			  
			}
			// If position is more than number of ndoes 
	        if (node == null || node.next == null) 
	            return;
	        
			 node.next=node.next.next;
			 
		}	
	}
	
}
