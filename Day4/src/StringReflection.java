import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

public class StringReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Class c;
			try 
			{
				c = Class.forName("java.lang.String");
				System.out.println("Name:"+c.getCanonicalName());
				
				Constructor[] con=c.getConstructors();
				
				
				for(Constructor constr:con)
				{
					Type[] types=constr.getGenericParameterTypes();
					for(Type t:types)
						System.out.print(t.getTypeName()+",");
					System.out.println();
				}
			} 
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		

		
	}

}
