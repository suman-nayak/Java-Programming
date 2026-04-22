//Develop a class to represent a Book with data members like title, author and price. Create an array of 5 book object and initialize them with parameterized constructor. Display the details of all the books.
import java.util.Scanner;
public class Books {
    String name;
	String title;
	double price;
	Books(String name,String title,double price){
		this.name=name;
		this.price=price;
		this.title=title;
	}
	void display(){
		System.out.println(this.name+""+this.title+""+this.price);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of books: ");
		int size = sc.nextInt();
		
		Books[] book = new Books[size];
		
		System.out.println("Enter "+size+" book details: ");
		for(int i=0; i<size; i++){
			System.out.print("Enter author name: ");
			String name = sc.next();
			System.out.print("Enter book title: ");
			String title = sc.next();
			System.out.print("Enter book price: ");
			double price = sc.nextDouble();
			
			book[i] = new Books(name,title,price);
		}
		System.out.println("the avil bookdetails are");
		for(int i=0;i<size;i++){
			book[i].display();
		}
	}
}