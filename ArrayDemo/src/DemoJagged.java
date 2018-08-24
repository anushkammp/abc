
public class DemoJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		int [][] a=new int[3][];
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=cnt;
				cnt++;
			}
		}
//		System.out.println(a[0].length);
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//				System.out.print("\t"+a[i][j]);
//			System.out.println();
//		}
		for(int[] i:a)
		{
			for(int j:i)
				System.out.print("\t"+j);
			System.out.println();
		}

	}

}
