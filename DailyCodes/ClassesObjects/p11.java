class Parent{
	int x=10;
	Parent(){
		System.out.println("In Parent Constructor");

	}
	void parentInfo(){
		System.out.println(x);

	}	
}
class Child extends Parent{
	int x=20;
	Child(){
		System.out.println("In Child Constructor");
	}
	void childInfo(){
		System.out.println(x);

	}
}
class Client{
	public static void main(String[] args){

	Parent pobj=new Parent();
	pobj.parentInfo();

	Child cobj=new Child();
	cobj.parentInfo();
	cobj.childInfo();


	}

}

