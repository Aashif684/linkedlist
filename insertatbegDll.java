package linkedList;
import java.util.*;
class Node{
	int data;
	Node prev;
	Node next;


	Node(int x){
		data=x;
		this.prev=null;
		this.next=null;
		
	}
}
public class insertatbegDll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head=new Node(10);
		Node temp1=new Node(20);
		Node temp2=new Node(30);
		head.next=temp1;
		
		temp1.next=temp2;
		temp1.prev=head;
		
	temp2.prev=temp1;
     System.out.println("the list of element inserted are: ");
		printlist(head);
		System.out.println("enter the new data to be inserted at last: ");
	Scanner s=new Scanner(System.in);
		int newdata=s.nextInt();
		System.out.println();
		head=insertatBeg(head,newdata);
		System.out.println("the list of element inserted  after insertion are: ");
		printlist(head);
		
		System.out.println("after the reverse: ");
	head=reverse(head);
	printlist(head);
		
		
		

	}
public static 	Node reverse(Node head) {
	
	if(head==null|| head.next==null)return head;
	Node prev=null,curr=head,next=null;
	while(curr!=null) {
	next=curr.next;
	curr.next=prev;
	prev=curr;
	curr=next;
	
}
	
	
	
	return prev;
}
	public static Node insertatBeg(Node head,int newdata) {
		Node temp=new Node(newdata);
		if(head==null)
			return temp;
		Node curr=head;
		
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=temp;
		temp.prev=curr;
		
		return head;
		
	}
public static void printlist(Node head) {
	Node curr=head;
	while(curr!=null) {
		System.out.println(curr.data+" ");
		curr=curr.next;
	}
	System.out.println();
}
	
}
