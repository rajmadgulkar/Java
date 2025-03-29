class Stringbuffer{
	public static void main(String[]args){

		StringBuffer str1=new StringBuffer ("Shashi");
		StringBuffer str2=new StringBuffer ("Bagal");

		System.out.println(str1);
		
		System.out.println(System.identityHashCode(str1));
		str1=str1.append(str2);
		System.out.println(str1);

		System.out.println(System.identityHashCode(str1));





	}



}
