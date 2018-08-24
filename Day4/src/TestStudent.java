import java.util.Scanner;

import com.pojo.Student;

public class TestStudent {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StudentIOImpl s=new StudentIOImpl();
		Student[] s1=new Student[5];
		s1=s.ReadFromUser();
		
		StudentFIO fi=new StudentFIO();
		fi.WriteStudents(s1);
		
		Scanner sc= new Scanner(System.in);
		int choice,rollno;
		int flag=0;
		
		System.out.println("-----------MENU-----------");
		System.out.println("1. Find Student \n2.Display all");
		choice=sc.nextInt();
		
		do
		{
			if(choice==1)
			{
				System.out.println("Enter student roll no to be searched:");
				rollno=sc.nextInt();
				Student[] s2=new Student[5];
				s2=fi.readStudents();
				for(Student ob:s2)
				{
					if(ob.getRollNO()==rollno)
					{
						flag=1;
						System.out.println(ob);
					}
						
				}
				if(flag==0)
					System.out.println("Data not found");
			}
			
			if(choice==2)
			{
				s.writeToUser(fi.readStudents());
			}
			else
				break;
			choice=sc.nextInt();
		}while(true);
	}

}
