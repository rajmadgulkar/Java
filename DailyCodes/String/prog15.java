class S3{
	public static void main(String[]args){

		String str1="Kanha";
		String str2="Ashish";
		String str3=new String("KanhaAshish");

		String str4=str3;

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);


		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		
		System.out.println(str3==str4);




	}




}
