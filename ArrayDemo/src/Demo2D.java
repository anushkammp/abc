
public class Demo2D {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int cnt=1;
		int [][] a=new int[3][];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[5];
		}
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=cnt;
				cnt++;
			}
		}
//		System.out.println(a[0].length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.print("\t"+a[i][j]);
			System.out.println();
		}
		
	}

}
