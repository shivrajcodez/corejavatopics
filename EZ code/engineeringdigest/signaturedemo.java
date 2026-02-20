class signaturedemo {

    void show(int a){
        System.out.println("Integer:"+a);
    }    

    void show(double a){
        System.out.println("Double:"+a);
    }

    public static void main(String[] args) {
        signaturedemo s = new signaturedemo();
        s.show(10);
        s.show(5.5);
    }
}