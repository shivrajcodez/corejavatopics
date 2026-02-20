class Shape
{
    void draw()
    {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing a circle");
    }
}

public class polymorphismdemo
{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}