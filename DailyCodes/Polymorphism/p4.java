class Demo{
	void fun(int x){
		System.out.println("Int method");
	}
	void fun(float x){
		System.out.println("Float method");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10);
		obj.fun(10.5f);
		obj.fun('A');
		//obj.fun(10.5);
		obj.fun(10L);
	}

}
