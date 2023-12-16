//Replace Characters

import java.util.Scanner;
class Replace {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input :");
        String str = sc.nextLine();
        System.out.println("Character :");
        char ch1 = sc.next().charAt(0);

        System.out.println("Replacement char :");
        char ch2 = sc.next().charAt(0);

        String str1 = str.replace(ch1 , ch2);
        System.out.println("Output :"+str1);




        

    }
}