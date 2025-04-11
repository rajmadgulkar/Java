class Parent{
	int x=10;
	Parent(){
		System.out.println("In Parent Constructor");

	}
}
class Child extends Parent{
	int x=20;
	Child(){
		System.out.println("In Child Constructor");
	}
	void childInfo(){
		System.out.println(x);
		System.out.println(super.x);

	}
}
class Client{
	public static void main(String[] args){

	Child cobj=new Child();
	cobj.childInfo();


	}

}

