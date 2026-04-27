class Parent
{
    String name;
    int age;

    Parent(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayPerson()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Child extends Parent
{
    int marks;

    Child(String name, int age, int marks)
    {
        super(name, age);
        this.marks = marks;
    }
    void displayStudent()
    {
        displayPerson();
        System.out.println("Marks: " + marks);
    }
}

public class InheritanceDemo
{
    public static void main(String[]args)
    {
        Child std = new Child("Spider-Man", 22, 98);
        std.displayStudent();
    }
}