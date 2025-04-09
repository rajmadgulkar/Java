class Demo{ 
	Demo(){
		System.out.println("In No-arg constructor");

	}
	Demo(int x,int y){

		System.out.println("In Two args constructor");
	}
	Demo(int x){

		System.out.println("In one arg constructor");

	}


}
class Client{
	public static void main(String[] args){
		Demo obj1=new Demo();
		Demo obj3=new Demo(20);
		Demo obj2=new Demo(10,20);



	}



}
