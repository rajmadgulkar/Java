class Demo{
	
	void fun(int x){
		System.out.println("Int Method");
	}
	void fun(float x){
		System.out.println("Float Method");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10);
		obj.fun(10.5);

	}


}
