class Demo{
	private int x=10;

	Demo(){
		System.out.println("Demo Constructor");
		System.out.println(x);

	}

}
class Demochild extends Demo{
	Demochild(){
		System.out.println("Demochild Constructor");
	}
}
class Client{
	public static void main(String[] args){
		Demochild obj=new Demochild();



	}


}
