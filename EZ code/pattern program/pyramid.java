import java.util.Scanner;

class pyramid{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i <= n;i++){
            for(int space = n;space >i;space--){
                System.out.print(" ");
            }
            for(int star = 1;star <= i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}