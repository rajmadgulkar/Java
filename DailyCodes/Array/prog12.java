class IdCheck{
	public static void main(String[]args){
		
		int x=10;
		
		System.out.println(System.identityHashCode(x));

		int arr[]=new int [] {10,20,30};
		Integer arr1[]=new Integer[]{10,20,30};

		System.out.println(arr);
		System.out.println(arr1);




	}



}
