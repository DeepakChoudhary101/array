class GreatestArray
{
    public static void main(String args[])
    {
        int a[]={2,3,4,5,6,7};
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            if (a[i]>s)
            {
                s=a[i];
            }
            
        }
        System.out.println("graetest no is"+s);
    }
}