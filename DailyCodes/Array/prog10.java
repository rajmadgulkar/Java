class T{
	public static void main(String[]args){

		int arr1[]=new int[]{128,128,128};
		
		Integer arr2[]=new Integer[]{128,128,128};

		System.out.println("The array1 elements are:");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);

		}
		System.out.println("The identity hashcodes for arr1:");
		for(int i=0;i<arr1.length;i++){
			System.out.println(System.identityHashCode(arr1[i]));

		}
		System.out.println("The array2 elements are:");
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);

		}


		System.out.println("The identity hashcodes for arr2:");
		for(int i=0;i<arr2.length;i++){
			System.out.println(System.identityHashCode(arr2[i]));

		}

	}


}
