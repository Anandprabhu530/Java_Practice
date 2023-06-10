package Java_Practice.Oop.Polymorphism;

public class Static_Polymorphism {
    public static void main(String[] args) {
        System.out.println("\nPolymorphism");
        Static_Polymorphism obj = new Static_Polymorphism();
        obj.hello(1, 2);
        obj.hello(1, "Hello");
        System.out.println("Their sum is " + obj.hello(1, 2, 3) + "\n");
    }

    void hello(int a, int b) {
        System.out.println("The Arguments are " + a + "," + b);
    }

    void hello(int a, String b) {
        System.out.println("The Arguments are " + a + "," + b);
    }

    // int hello(int a,int b){
    // return a+b;
    // }

    int hello(int a, int b, int c) {
        System.out.println("The Arguments are " + a + "," + b + "," + c);
        return a + b + c;
    }

}
