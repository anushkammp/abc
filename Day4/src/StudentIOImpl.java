import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import com.myinterfaces.StudentIO;
import com.pojo.Student;

public class StudentIOImpl implements StudentIO {

	@Override
	public Student[] ReadFromUser() 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int rollno,total;
		Student[] stu=new Student[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter roll_no");
			rollno=sc.nextInt();sc.nextLine();
			System.out.print("Enter name");
			name=sc.nextLine();
			System.out.print("Enter Total");
			total=sc.nextInt();
			stu[i]=new Student(rollno,total,name);
		}
		return stu;
	}

	@Override
	public void writeToUser(Student[] students) 
	{
		// TODO Auto-generated method stub
		FileInputStream fi;
		try 
		{
			fi = new FileInputStream("file1.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			Student[] stu=(Student[]) oi.readObject();
			for(Student st:stu)
				System.out.println(st);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
