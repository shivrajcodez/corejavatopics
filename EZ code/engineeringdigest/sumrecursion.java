import java.util.Scanner;

class sumrecursion{

    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n+sum(n-1);
    }

        public static void main(String...shiv){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = sc.nextInt();

        System.out.println("Sum = "+sum(num));
}
}