public class arraysum{
    public static void main(String... shiv){
        int[] arr = {5,10,15};
        int sum = 0;

        for (int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum ="+sum);
    }
}