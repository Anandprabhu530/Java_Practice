package Java_Practice.Oop;

public class finalobj {
    public static void main(String[] args) {
        System.out.println("Lets try to change the final object");
        final Student obj = new Student("mario", 38, 10);
        System.out.println(
                "The name of the student is " + obj.name + " roll no is " + obj.rollno + " and standard is " + obj.std);
        System.out.println("\nTrying to change the value");
        obj.name = "defalut name";
    }
}

class Student {
    String name;
    int rollno;
    int std;

    Student(String Name, int Rollno, int Std) {
        this.name = Name;
        this.rollno = Rollno;
        this.std = Std;
    }
}
