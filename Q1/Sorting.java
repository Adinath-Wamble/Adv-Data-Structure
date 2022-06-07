class Sorting{
	public  static  void insertion(int arr[]){
		int le = arr.length;
		int data = arr[le-1];
		for(int i = le-2; i>= 0; i--){
			if(arr[i]> data){
				arr[i+1] = arr[i];
				display(arr);
			}
			else {
				arr[i+1] = data ;
			display(arr);
			break;
		}
		if((i ==0)&& (arr[i]>data))
			{
				arr[i] = data;
				display(arr);
			}
		}
	}

		public static void display(int arr[]){
			for(int n : arr){
				System.out.print(n+" ");
			}
			System.out.println();
		}
	public static void main(String [] args){
		int arr[] = new int []{1,2,4,5,3};
		System.out.println("Before Sorting");
		for(int n : arr){
				System.out.print(n+" ");
			}
			System.out.println();
			System.out.println("after Sorting");
		insertion(arr);
			
	}
}