class largenum
{
    public static void main(String args[])
    {
        int[] ar={2,4,6,112,32,54,98};
        int fv=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(fv<ar[i])
            {
                fv=ar[i];
            }
        }
        System.out.println("THe biggest no is: "+fv);
    }
}