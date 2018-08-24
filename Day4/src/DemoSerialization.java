import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.pojo.Student;

public class DemoSerialization {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student[] student =new Student[3];
		Scanner sc=new Scanner(System.in);
		String name;
		int rollno,total;
		try 
		{
			FileOutputStream fo=new FileOutputStream("student.txt");
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			
			for(int i=0;i<3;i++)
			{
				System.out.print("Enter roll_no");
				rollno=sc.nextInt();sc.nextLine();
				System.out.print("Enter name");
				name=sc.nextLine();
				System.out.print("Enter Total");
				total=sc.nextInt();
				student[i]=new Student(rollno,total,name);			
			}
			oo.writeObject(student);
			oo.close();
			fo.close();
			
			System.out.println("Operation Successful");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
