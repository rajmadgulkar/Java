class booksException extends RuntimeException{

	booksException(String msg){

		super(msg);

	}
	public static void main(String[] args){

		throw new booksException("All books issued.");



	}



}
