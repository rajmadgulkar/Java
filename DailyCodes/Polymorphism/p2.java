class Addition{
	void add(int x, int y){
		System.out.println(x+y);
	}
	void add(int x, int y,int z){
		System.out.println(x+y+z);
	}
}
class Client{
	public static void main(String[] args){
		Addition obj= new Addition();
		obj.add(10,20);
		obj.add(10,20,30);


	}

}
