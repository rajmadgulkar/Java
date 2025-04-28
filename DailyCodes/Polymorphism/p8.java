class Demo{
	void fun(int x,float y){
		System.out.println("Int-Float method");
	}
	void fun(float x,int y){
		System.out.println("Float-Int method");
	}
}
class Client{
	public static void main(){
		Demo obj=new Demo();
		obj.fun(10,10);


	}
}
