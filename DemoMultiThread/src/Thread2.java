public class Thread2 implements Runnable{
    public void run() {
           System.out.println("run");
           throws (new RuntimeException("Problem"));
     }

     public static void main(String[]args){
                 Thread t=new  Thread(new Thread2());
                  t.start();
                  System.out.println("end of method");
       }
}