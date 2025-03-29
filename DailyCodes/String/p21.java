class Cbuffer{
	public static void main(String[]args){

		String str1="C2W";
		String str2="Core2Web";
		System.out.println(str1);

		System.out.println(System.identityHashCode(str1));
		System.out.println(str2);
		str1=str1+"Shashi";
		System.out.println(str1);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1);
		System.out.println(str2);





	}



}
