import com.demo.MyInterface;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("Show Data from implentation class");

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyInterface in=new MyInterfaceImpl();
		in.showData();

	}

}
