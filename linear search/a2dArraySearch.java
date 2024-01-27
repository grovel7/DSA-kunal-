import java.util.Arrays;

public class a2dArraySearch 
{
    public static void main(String args[])
    {
        int [] [] arr = 
        {
            {23,4,1},
            {34,56,78,1},
            {56,90,48},
            {81,35}

        };
        
        int ans = arraySearch(arr);
        System.out.print((ans));
    }

    static int arraySearch( int [][] arr)
    {
        int maxNum = arr[0][0];
        for( int i = 0;i<arr.length;i++)
        {
            for( int j = 0;j<arr[i].length;j++) // iterate on row ko length not the entire array length :)
            {
                if( maxNum < arr[i][j] )
                {
                    maxNum =arr[i][j];
                }
            }
        }
        return maxNum;
    }
}
