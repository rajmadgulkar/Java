class STDBuffer{
	public static void main(String[]args){

		String str="Ashish";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		StringBuffer str1=new StringBuffer(str);
		System.out.println(System.identityHashCode(str1));
		str1.reverse();
		str=str1.toString();
		System.out.println(System.identityHashCode(str));
		System.out.println(str);



	}



}
