package Java_Practice.Oop.Access_Modifier;

public class protected_modifier {
    protected static int num = -1;

    public static void main(String[] args) {
        System.out.println("\n----Protected Modifier----");
        System.out.println("1.The initial value of num is " + num);
        System.out.println("\n2.Let's try to update it to 340");
        num = 340;
        System.out.println("\tThe Updated value of num is " + num + "\n");
    }
}
