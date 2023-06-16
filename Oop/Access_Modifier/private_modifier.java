package Java_Practice.Oop.Access_Modifier;

public class private_modifier {
    public static void main(String[] args) {
        System.out.println("\n----Private Modifier----");
        System.out.println("1. Now we call the getter method");
        Test obj1 = new Test();
        int n = obj1.getter();
        System.out.println("2. Now we call Setter method");
        obj1.setter(30);
    }
}

class Test {
    private int num = -1;

    public int getter() {
        System.out.println("\tThe num is private and its initial value is set to " + num);
        return num;
    }

    public void setter(int n) {
        this.num = n;
        System.out.println("\tThe num is set to " + n + "\n");
    }
}
