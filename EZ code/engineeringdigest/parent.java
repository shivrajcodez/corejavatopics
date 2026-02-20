class parent{
    protected int number=200;

    protected void show(){
        System.out.println("Number:"+number);
    }
}

class child extends parent{
    public static void main(String[]args){
        child obj=new child();
        obj.show();
    }
}