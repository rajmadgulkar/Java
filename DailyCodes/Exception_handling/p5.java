class Demo{
	
	void fun(){
		System.out.println("In Fun");
	}

	void run(){
		System.out.println("In run");

	}
}
class Client{
	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun();

		obj=null;

		obj.run();

	}



}
