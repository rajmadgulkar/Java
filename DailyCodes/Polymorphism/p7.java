class Demo{
	void fun(String x){
		System.out.println("String Method");
	}
	void fun(Object x){
		System.out.println("Object Method");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun("");
		obj.fun("Raj");
		obj.fun(new StringBuffer("Raj"));
		obj.fun(new String("Raj"));
		obj.fun(null);

	}

}
