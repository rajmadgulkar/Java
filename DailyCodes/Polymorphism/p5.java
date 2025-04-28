class Demo{
	void fun(int x){
		System.out.println("Int method");
	}
	void fun(char x){
		System.out.println("Char method");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10);
	//	obj.fun(10.5);
		obj.fun("ABX");
		//obj.fun(10.5);
	//	obj.fun(10L);
	}

}
