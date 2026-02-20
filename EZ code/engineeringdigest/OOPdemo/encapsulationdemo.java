class Student
{
    private String name;
    private int age;

    public void setName(String n)
    {
        name=n;
    }
    public void setAge(int a)
    {
        age=a;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}  

public class encapsulationdemo
{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.setName("Shiv");
        s.setAge(20);

        System.out.println("Name:"+s.getName());
        System.out.println("Age:"+s.getAge());
    }
}