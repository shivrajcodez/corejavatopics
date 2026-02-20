public class tailrecursiondemo {

    static int factorial(int n,int result){
        if(n==0){
            return result;
        }
        return factorial(n-1,n*result);
    }
    public static void main(String[] args) {
        int num=5;
        int ans=factorial(num,1);
        System.out.println("Factorial = "+ans);
    }
}