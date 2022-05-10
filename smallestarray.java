class SmallestArray
{
    public static void main(String args[])
    {
        int a[]={2,3,4,5,6,1,7};
       int s=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<s)
            {
                s=a[i];
            }
        }
        System.out.println("smalllest no is" +s);  

    }
}