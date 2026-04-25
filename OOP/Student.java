public class Student
{
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    void getGrade()
    {
        String x = "";

        if(marks >= 90){
            x = "A+";
        } else if(marks >= 80){
            x = "A";
        } else if(marks >= 70){
            x = "B";
        } else if(marks >= 60){
            x = "C";
        } else {
            x = "Fail";
        }

        System.out.println("Name: " + name);
        System.out.println("Grade: " + x);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student("Spider-Man", 90);
        s1.getGrade();
    }
}