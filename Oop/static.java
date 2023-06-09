package Java_Practice.Oop;

class main {
    public static void main(String[] args) {
        seperate obj1 = new seperate("Anand", 6, "M.Tech");
        System.out.println("\nStudent name is " + obj1.name + " and his rollno is " + obj1.rollno
                + " and his departement is " + obj1.dept);
        System.out.println("The total number of student in clg are " + seperate.count);
        seperate obj2 = new seperate("Prabhu", 40, "B.Tech");
        System.out.println("\nStudent name is " + obj2.name + " and his rollno is " + obj2.rollno
                + " and his departement is " + obj2.dept);
        System.out.println("The total number of student in clg are " + seperate.count + "\n");
        // this.count can also be used but static variables is better accessed by static
        // way
    }
}

class seperate {
    String name;
    int rollno;
    String dept;
    static int count;

    seperate(String Name, int Rollno, String Dept) {
        this.name = Name;
        this.rollno = Rollno;
        this.dept = Dept;
        // this.count+=1;
        // above code also can be used but static variables is better accessed by static
        // way
        seperate.count += 1;
    }
}