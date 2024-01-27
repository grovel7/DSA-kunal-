import java.util.*;
class rec01{




// is the given number in the list of array?

    public static void main(String args[])
    {
        int[] arr = {12,34,56,89,90};
        int target = 12;
        int ans = printArray(arr, target);


        if ( ans == -1)
        {
            System.out.print("the number is not in the array list");
        }
        else
        {
            System.out.println("the number " + target + " is on index " + ans  );
        }
    }



    public static int printArray( int[] nums , int aTarget)
    {
        boolean found = false;
        for (int i = 0;i<nums.length;i++)
        {
            if(nums[i] == aTarget)
            {
                return i;


            }
            
        }
        return -1;
    }
}
