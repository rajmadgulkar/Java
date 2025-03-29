class StringTest{
	public static void main(String[]args){

		String str1=new String("Shashi");
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1);
		str1=str1+"Bagal";
  		System.out.println(str1);
  		System.out.println(System.identityHashCode(str1));




	}


}
