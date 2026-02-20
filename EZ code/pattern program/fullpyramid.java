import java.util.Scanner;

class fullpyramid{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i <= n;i++){
            for(int space = n;space > i;space--){
                System.out.print(" ");
            }
            for(int star = 1;star <= (2*i-1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}