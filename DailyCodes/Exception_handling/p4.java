class Demo{

	static void run(){

		System.out.println("Start Run");
		System.out.println(10/0);
		System.out.println("End Run");

	}

	static void fun(){

		System.out.println("Start Fun");
		run();
		System.out.println("End Run");
	}
	public static void main(String[] args){
		
		System.out.println("Start Main");
		fun();
		System.out.println("End Main");



	}

}
