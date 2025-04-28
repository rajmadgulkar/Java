class Demo{
	void fun(double x){
		System.out.println("Double");
	}
	void fun(double ...x){
		System.out.println("Var-args");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10.4);
		obj.fun(10);
		obj.fun(10,20);
		obj.fun();

	}
}
