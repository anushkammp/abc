
public class MyThread extends Thread 
{
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("Thread running:"+Thread.currentThread().getName());
		System.out.println("Hello");
	}
	
	public static synchronized void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
         t.start();
         System.out.print("X");
          t.wait(10000);
         System.out.print("Y");
	}
	
//
//	public static synchronized void main(String[] args) 
//	{
//	Thread t=new  MyThread() { 
//        public void run() {
//            System.out.print("foo ");
//      }
//};
//t.start();
//	Thread.setName("AAA");
	
//	Runnable r=new Runnable() {
//	     public void run(){
//	             System.out.println("cat");
//	      }
//	}
//
//	Thread t=new Thread(r){
//	     public void run(){
//	             System.out.println("dog");
//	      }
//	};
//	t.start();
	
	}


