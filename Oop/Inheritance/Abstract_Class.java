package Java_Practice.Oop.Inheritance;

public class Abstract_Class {
    public static void main(String[] args) {
        support_class obj = new support_class() {
            @Override
            void fly() {
                System.out.println("Iam Sleeping");
            }

            void sleep() {
                System.out.println("Iam Sleeping inside main class");
            }
        };
        obj.fly();
        obj.sleep();
    }
}

abstract class support_class {
    abstract void fly();

    void sleep() {
        System.out.print("Iam Sleeping inside abstarct class");
    }
}