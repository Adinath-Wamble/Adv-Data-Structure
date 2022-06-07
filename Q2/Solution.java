
class Solution{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(){
			data = 0;
			next = null;
		}
		Node(int d){
			data = d;
			next = null;
		}
	}
		public Node reverseTheLinkedlist(Node h){
			Node n= null;
			Node temp = h;
			Node nn = null;
			
			while(temp != null){
				nn= temp.next;
				temp.next = n;
				n = temp;
				temp = nn;
			}
			h = n;
			return h;
		}
		public void display(Node n ){
         
		 while( n!= null){
            System.out.println(n.data+ " " );
             n = n.next;
            }
		}
		public void display2( Node n)
		{
		 while( n!= null){
            System.out.print(n.data+ " " );
             n = n.next;
            }
			
		}		
	public static void main(String [] args){
		Solution gg = new Solution();
		gg.head = new Node(1);
		gg.head.next= new Node(5);
		gg.head.next.next= new Node(1);
		gg.head.next.next.next= new Node(2);
		gg.head.next.next.next.next = new Node(3);
		gg.head.next.next.next.next.next = new Node(4);
		gg.head.next.next.next.next.next.next = new Node(5);
		System.out.println("Linked list before reversing");
		gg.display(head);
		System.out.println();
		head = gg.reverseTheLinkedlist(head);
		System.out.println();
		System.out.println("Linked list arter reversing");
		gg.display2(head);
		System.out.println();
		System.out.println();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println();
		gg.head = new Node(2);
		gg.head.next= new Node(4);
		gg.head.next.next= new Node(3);
		gg.head.next.next.next= new Node(4);
		gg.head.next.next.next.next = new Node(2);
		gg.head.next.next.next.next.next = new Node(5);
		System.out.println("Linked list before reversing");
		gg.display(head);
		System.out.println();
		head = gg.reverseTheLinkedlist(head);
		System.out.println("Linked list arter reversing");
		gg.display2(head);
		System.out.println();
		
		
	}
}
