class Addition{
	
	void add(int x, int y,int z){
		System.out.println("Int-Int-Int method");
	}
	void add(int x,float y){
		System.out.println("Int-Float method");
	}

}
class Client{
	public static void main(String[] args){
		Addition obj= new Addition();
		obj.add(10,20);
		obj.add(10,20,30);


	}

}
