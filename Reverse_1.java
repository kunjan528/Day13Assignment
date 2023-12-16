//Test Case 1: Input: "Hello World" Expected Output: "World Hello"

//package Day13_Assignment;
import java.util.Scanner ;
public class Reverse_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("String :");
        String str = sc.nextLine();
        String s[]=str.split(" ");
        String[]b = new String[s.length];
        String sc1 = " " ;
        
        
        for(int i = s.length-1;i>=0;i--)
        {
            sc1+= " "+s[i] ;
        }
        System.out.println("Output :"+sc1);
        

    }
    
}
 