class publicdemo{
    public int number=10;

    public void show(){
        System.out.println("Number:"+number);
    }

    public static void main(String... args){
        publicdemo obj=new publicdemo();
        obj.show();
        }
}