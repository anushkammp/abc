import java.util.List;
import java.util.Scanner;

import com.beans.Book;
import com.dao.BookDAO;

public class MainFunction 
{
	public static Book getData()
	{
		
		int no;
		String name,publication,author;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id:");
		no=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name:");
		name=sc.nextLine();
		System.out.print("Enter publication:");
		publication=sc.nextLine();
//		sc.nextLine();
		System.out.print("Enter author:");
		author=sc.nextLine();
//		sc.nextLine();
		return new Book(no,name,publication,author);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int choice,no;
		String name,author;
		Book b;
		BookDAO ob=new BookDAOImpl();
		
		do
		{
			System.out.println("--------MENU------");
			
			System.out.println("1)Add Book \n2)Update book \n3)Delete data \n4)Display all book \n5)Find by ID \n6)Find by name \n7)Find by author");
			choice=sc.nextInt();sc.nextLine();
			
			switch(choice)
			{
			case 1:	System.out.println("Add book");
					ob.addBook(getData());
					System.out.println("Data added successfully");
					break;
					
			case 2:	System.out.println("Update book");
					System.out.print("Enter id:");
					no=sc.nextInt();
					sc.nextLine();
					b=getData();
					if(ob.updateBook(b,no)>=1)
						System.out.println("Data updated");
					else
						System.out.println("Data not updated");
					break;
					
			case 3:	System.out.println("Delete book");
					System.out.print("Enter id:");
					no=sc.nextInt();
					sc.nextLine();
					if(ob.deleteBook(no)==1)
						System.out.println("Data deleted");
					else
						System.out.println("Data not deleted");
					break;
					
			case 4: System.out.println("Display all book");
					List<Book> books=ob.findAllBook();
					for(Book b1:books)
						System.out.println(b1);
					break;
					
			case 5:	System.out.println("Find by ID");
					System.out.print("Enter id:");
					no=sc.nextInt();sc.nextLine();
					System.out.println(ob.findBookbyID(no));
					break;

			case 6:	System.out.println("Find by name");
					System.out.print("Enter name:");
					name=sc.nextLine();
					System.out.println(ob.findBookbyName(name));
					break;
					
			case 7:	System.out.println("Find by author");
					System.out.print("Enter author:");
					author=sc.nextLine();
					System.out.println(ob.findBookbyAuthor(author));
					break;
					
			default:System.out.println("No operation");
			
			}
		}while(choice<=7 && choice>=1);
	System.out.println("Done....");
	}
}
