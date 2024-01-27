import java.util.*;
class stringSearch
{
    public static void main(String arg[])
    {
        String Name = "Sarthak";
        char target = 'f';
        int ans = search(Name,target);
        // if (ans == 1)
        // {
            
        //     System.out.println(target + " is at "+ "index " + ans);
        // }
        // if (ans == 0)
        // {
        //     System.out.println(target + " is not in the string ");

        // }
        System.out.print(Name.toCharArray());
    }
    static int search(String str,char aTarget)
    {

        for (char ch: str.toCharArray())
        {
            if(ch == aTarget)
            {
                return 1;
            }
            
        }
        return 0;
        // for( int  i =0 ;i<str.length();i++)
        // {
        //     if( str.charAt(i) == aTarget)
        //     {
        //         return 1;
        //     }
        // }
        // return 0;
    }
}