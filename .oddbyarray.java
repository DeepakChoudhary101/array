class OddByArray
{
    public static void main(String args[])
    {
      int a[]={2,3,4,5,6,7,8,9,0};
       {
          for(int i=0;i<a.length;i++)
           {
              if(a[i]%2!=0)
               {
                 System.out.println("odd no is "+a[i]);
               }
           }
       }
   }
}