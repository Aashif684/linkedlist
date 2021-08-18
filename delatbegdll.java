package linkedList;
import java.util.*;
class Nodes{
	int data;
	Nodes prev;
	Nodes next;

	Nodes(int x){
		data=x;
		prev=null;
		next=null;
		
	}
}

public class delatbegdll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nodes head=new Nodes(10);
		Nodes temp1=new Nodes(20);
		Nodes temp2=new Nodes(30);
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
	temp2.prev=temp1;
	printlist(head);
	System.out.println("After deletion of first element:");
	head=delatbeg(head);
	printlist(head);
	head=delatlast(head);
	System.out.println("after deletion of last element : ");
	printlist(head);
	
	}
	public static Nodes delatlast(Nodes head) {
		if(head==null)
			return null;
		 if(head.next==null)
			 return null;
		 Nodes curr=head;
		 while(curr.next.next!=null) {
			 curr=curr.next;
		 }
		 curr.next=null;
		 return head;
	}
	public static Nodes delatbeg( Nodes head) {
		if(head==null)
			return null;
		else
		{
			head.next.prev=null;
			return head.next;
		}
	}
	public static void printlist(Nodes head) {
		Nodes curr=head;
		while(curr!=null) {
			System.out.println(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
		
}
