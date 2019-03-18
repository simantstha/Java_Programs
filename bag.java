import java.lang.Throwable;
class SameColorBallException extends Exception {
    private static final long serialVersionUID = 1L;
    String s1;
    SameColorBallException(String s2) {
       s1 = s2;
    } 
    @Override
    public String toString() { 
       return (s1);
    }
 }
class bag
{
    public static void main(String args[])
    {
        int red=0,yellow=0,green=0,blue=0;
        int i=10;
        while(i>0)
        {
            int ran=(int)Math.round(Math.random()*3);
            switch(ran)
            {
                case 0:
                    red++;
                    break;
                case 1:
                    yellow++;
                    break;
                case 2:
                    green++;
                    break;
                case 3:
                    blue++;
                    break;
            }
            try
            {
                if(red<=3 && yellow<=3 && green<=3 && blue<=3)
                {
                    i--;
                }
                else
                {
                    throw new SameColorBallException("More Than 3 Exception Occured");
                }
            } 
            catch(SameColorBallException e)
            {
                System.out.println(e);
                i=10;
                red=0;
                yellow=0;
                green=0;
                blue=0;
            }
        }
        System.out.println("red:"+red);
        System.out.println("yellow:"+yellow);
        System.out.println("green:"+green);
        System.out.println("blue:"+blue);
    }
}