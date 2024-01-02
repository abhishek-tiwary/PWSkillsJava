import java.util.Scanner;

public class PalindromeChecker{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int k= num;
        int rev=0;
        int rem;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(k==rev){
            System.out.println("It is a plaindrome number");
        }
        else{
            System.out.println("It is not a palindrome number");
        }
        sc.close();
    }
}

