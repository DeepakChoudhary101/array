class SumAvgArray
{
    public static void main(String args[])
    {
        int a[]={4,3,2,1,4};
        int sum=0;
        float avg;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        avg=sum/a.length;
        System.out.println("sum of arrayelement"+sum);
        System.out.println("average of array element"+avg);
    }
}