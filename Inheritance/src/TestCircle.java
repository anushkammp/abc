import com.myabstract.Circle;
import com.myabstract.Shape;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle(7,"Circle");
		double a=s.area();
		s.desc();
		System.out.println("Area of circle:"+a);

	}

}
