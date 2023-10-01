public class Book {
	public static String name ; 
	public static int ID;

	public Book ( int ID , String name ){
		this.ID = ID;  
		this.name = name ;
	}

	public void setID(int ID){
		this.ID = ID;  
	}
	public void setName(String name){
		this.name = name ;
	}
	public int getID () {
		return this.ID ;	
	}
	public String getName(){
		return this.name ; 
	}
}