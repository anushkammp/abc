//import com.demo.Person;

public class Demo1DObject 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Person[] persons = new Person[4];
		persons[0]=new Person();
		persons[1]=new Person(12,"AAA");
		persons[2]=new Person(14,"BBB");
		persons[3]=new Person(18,"CCC");
		
//		for(int i=0;i<persons.length;i++)
//		{
//			persons[i].display();
//		}

		//OR
		
		for(Person x:persons)
		{
			x.display();
		}
		
	}

}
