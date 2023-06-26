package Java_Practice.Oop.Inheritance;

public class Abstract_Class {
    public static void main(String[] args) {
        ans obj = new ans();
        obj.eat();
        obj.sleep();
        obj.fly();
    }
}

class ans extends support_class {
    void eat() {
        System.out.println("Iam inside ans class");
    }

    void sleep() {
        System.out.println("Iam sleeping inside ans class");
    }

    void fly() {
        System.out.println("Iam flying in ans class");
    }
}

abstract class support_class {
    abstract void fly();

    void sleep() {
        System.out.println("Iam Sleeping inside abstarct class");
    }
}