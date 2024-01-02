import java.util.Scanner;

public class NumPrinting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //printing 1 to 20 using for loop
        for (int i= 1; i <=20; i++){
            System.out.print(i+" ");
        }
        //printing 21 to 40 using while loop
        int a = 21;
        while (a<=40) {
            System.out.print(a+ " ");
            a++;
        }
        //printing 41 to 50 using do while loop
        int b = 41;
        do {
            System.out.print(b+ " ");
            b++;
        } while (b<=50);
        sc.close();

    }

    }
