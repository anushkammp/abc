import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class MyClass<T> 
{
	private T data;
	
	public MyClass() 
	{
		// TODO Auto-generated constructor stub
		
	}

	public MyClass(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		List<Book> list=new ArrayList<Object>();
		
		MyClass<Integer> class1=new MyClass<>();
		MyClass<Double> class2=new MyClass<>();
		MyClass<String> class3=new MyClass<>();
		MyClass<Book> class4=new MyClass<>();
		class1.setData(12);
		class2.setData(1.12);
		class3.setData("Hello");
		class4.setData(new Book());
		System.out.println(class1.getData());
		System.out.println(class2.getData());
		System.out.println(class3.getData());
		System.out.println(class4.getData());

	}
}
