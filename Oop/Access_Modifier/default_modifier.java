package Java_Practice.Oop.Access_Modifier;

public class default_modifier {
    static int num = -1;

    public static void main(String[] args) {
        System.out.println("\n----Default Modifier----");
        System.out.println("1.The initial value of num is " + num);
        System.out.println("\n2.Let's try to update it to 3");
        num = 3;
        System.out.println("\tThe Updated value of num is " + num + "\n");
    }
}
