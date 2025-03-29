class StringDemo{
	public static void main(String[]args){

		String str1="Kanha";
		String str2="Ashish";
		String str3="KanhaAshish";

		String str4=str1.concat(str2);
		System.out.println(str4);

		str4=str4.intern();

		System.out.println(str3==str4);




	}
}
