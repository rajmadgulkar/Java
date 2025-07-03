class Demo{

	void fun(){



	}
	public static void main(String[] args){

		Demo obj=new Demo();
		obj.fun();

		obj=null;
		try{

			obj.fun();
		}catch(ArithmeticException ae){

			System.out.println("Arith Exp");

		}catch(Exception e){

			System.out.println("Exception");

		}








	}


}
