public class smallestelement{
    public static void main(String[] args){
        int[]arr = {25,20,40,30};
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest ="+min);
    }
}