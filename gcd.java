interface GCD
{
    int computeGCD(int num1,int num2);
}
class approach1 implements GCD
{
    public int computeGCD(int num1,int num2)
    {
        if(num1==0)
            return num2;
        return computeGCD(num2%num1,num1);
    }
}
class approach2 implements GCD
{
    public int computeGCD(int num1,int num2)
    {
        int a=num1;
        int temp=0;
        if(num1>num2)
            a=num2;
        for(int i=1;i<a;i++)
        {t
            if(num1%i==0 && num2%i==0)
                if(i>temp)
                    temp=i;
        }
        return temp;
    }
}

class compute
{
    public static void main(String args[])
    {
        approach1 obj1= new approach1();
        System.out.println("GCD is: "+obj1.computeGCD(35,15));
        approach2 obj2=new approach2();
        System.out.println("GCD is: "+obj2.computeGCD(35,15));
    }
}