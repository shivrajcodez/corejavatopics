import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        boolean prime = true;

        for(int i=2;i<num;i++){
            if(num % i==0){
                prime=false;
                break;
            }
        }
        if(prime && num>1)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}