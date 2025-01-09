public class oopsBasics {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Alok kumar";
        s2.name = "sakshi kumari";
        s1.rollno = 56;
        s2.rollno = 99;

        System.out.println(s1.rollno);
        System.out.println(s2.name);
    }
}

class Student{
    int rollno;
    String name;
}