import java.util.concurrent.atomic.AtomicInteger;
class multithread extends Thread
{
    int[] marks={1,2,3,4,5,6,7,8,9,10};
    int[] count={3,4,17,8,23,10,4,6,5,2};
    public static void main(String args[])
    {
        mutlithreading obj=new mutlithreading();
        AtomicInteger mulsum=new AtomicInteger(0);
        AtomicInteger sum=new AtomicInteger(0);
        Thread t1= new Thread()
        {
           public void run()
           {
               int mul=0;
                for(int i=0;i<10;i++)
                {   
                    mul= mul + obj.marks[i]*obj.count[i];
                }
                mulsum.set(mul);
           }
        };
        Thread t2= new Thread()
        {
            int sul=0;
            public void run()
            {
                for(int i=0;i<10;i++)
                {
                    sul+=obj.count[i];
                }
                sum.set(sul);
            }
        };
        Thread t3= new Thread()
        {
            public void run()
            {
                double me;
                int m=mulsum.get();
                int n=sum.get();
                me=m/n;
                System.out.println("The Mean is: "+me);
            }
        };
        t1.start();
        t2.start();
        t3.start();
    }
}
