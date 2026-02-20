import java.util.Scanner;

class Factorial{
    public static void main(String[]shiv){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }

        System.out.println("Factorial ="+fact);
    }
}