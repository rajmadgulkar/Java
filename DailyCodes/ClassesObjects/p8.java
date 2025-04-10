class Wrestling{
	String freeWres="Free-Style Wrestling";
	String GreWres="Greco Roman Wrestling";
	void wresInfo(){
		System.out.println(freeWres);
		System.out.println(GreWres);
	}
}
class FreeStylePlayers extends Wrestling{
	String Player1="Tushar Devkate";
	String Player2="Anuj Sabde";
	void FreeStyleInfo(){
		System.out.println(Player1);
		System.out.println(Player2);
	}
} 
class Client{
	public static void main(String[] args){
		FreeStylePlayers obj1=new FreeStylePlayers();
		obj1.FreeStyleInfo();
		obj1.wresInfo();
	}
}
