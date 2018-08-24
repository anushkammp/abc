import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.myinterfaces.StudentFileOI;
import com.pojo.Student;

public class StudentFIO implements StudentFileOI {

	@Override
	public Student[] readStudents() 
	{
		// TODO Auto-generated method stub
		Student[] stu=new Student[5];
		try 
		{
			FileInputStream fi=new FileInputStream("file1.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			stu=(Student[]) oi.readObject();
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
		return stu;
	}

	@Override
	public int WriteStudents(Student[] students) 
	{
		// TODO Auto-generated method stub
		FileOutputStream fo;
		try 
		{
			fo = new FileOutputStream("file1.txt");
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(students);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

}
