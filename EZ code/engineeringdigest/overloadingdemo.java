class overloadingdemo{

    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    public static void main(String[]args){
        overloadingdemo obj=new overloadingdemo();

        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(5.5,4.5));
    }
}