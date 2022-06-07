class Stack{
	int data;
	int top1;
	int top2;
	int arr[];
	int n ;
	Stack(int size){
		data = 0;
		top1=-1;
		top2=size;
		n = size;
		arr = new int[size];
	}
	public void push1(int data )
	{
		if(top1 < top2 -1)
		{
			arr[++top1]= data;
		}
		else {
			System.out.println("stack is full");
		}
	}
	public void push2(int data)
	{
		if(top1 < top2 -1)
		{
			arr[--top2]= data;
		}
		else {
			System.out.println("stack is full");
		}
	}
	public int pop1()
	{
		if(top1>=0)
		{
			int data = arr[top1];
			top1--;
			return data;
		}
		else
		{
			System.out.println("stack is emppty");
		}
		return 0;
	}
	
	public int pop2()
	{
		if(top2<n)
		{
			int data = arr[top2];
			top2++;
			return data;
		}
		else
		{
			System.out.println("stack is empty");
		}
		return 0;
	}
	
			
}
class TwoStack{
	public static void main(String [] args){
		Stack st =  new Stack(10);
			st.push1(5);
			st.push2(10);
			st.push2(15);
			st.push1(11);
			st.push2(7);
			st.push2(40);
			System.out.println("Popped element from stack1 is "+st.pop1());
			System.out.println("Popped element from stack1 is "+st.pop2());
	}
}