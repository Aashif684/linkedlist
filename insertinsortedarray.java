package linkedList;import java.util.*;
class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
	}
}

public class insertinsortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=500;
		Node head=new Node(100);
		Node temp=new Node(200);
		Node temp2=new Node(300);
		head.next=temp;
		temp.next=temp2;
		head=insertsorted(head,x);
		printlist(head);
		

	}
	public static Node insertsorted(Node head,int x) {
		Node temp=new Node(x);
		if(head==null)return temp ;
		if(x<head.data) {
			temp.next=head;
			return temp;
		}
		Node curr=head;
		while(curr.next!=null && curr.next.data<x) {
			curr=curr.next;
		}
		temp.next=curr.next;
		curr.next=temp;
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
