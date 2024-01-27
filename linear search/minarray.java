public class minarray 
{
    public static void main(String arg[])
    {
        int arr[] = {67,89,12,3,1,2,-9};
        int ans = arraySearch(arr);
        System.out.print(ans);
    }

    static int arraySearch(int arr[])
    {
        int minimumNum =arr[0];
        for ( int i = 1;i<arr.length;i++)
        {
            if( arr[i] < minimumNum )
            {
                minimumNum = arr[i];
            }
        }
        return minimumNum;

    }
    
    
}
