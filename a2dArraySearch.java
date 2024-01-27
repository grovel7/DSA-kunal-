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
        int target =1;
        int[] ans = arraySearch(arr, target);
        System.out.print(Arrays.toString(ans));
    }

    static int[] arraySearch( int [][] arr,int target)
    {
        for ( int row = 0;row<arr.length;row++)
        {
            for ( int col = 0;col<arr.length;col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
