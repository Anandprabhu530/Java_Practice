package Java_Practice.Oop.Access_Modifier;

public class public_modifier {
    public static int num = 10;

    public static void main(String[] args) {
        System.out.println("\n----Public Modifier----");
        System.out.println("1.The Initial value of num is " + num);
        System.out.println("\n2.Now we try to set it to the number 99");
        num = 99;
        System.out.println("\tThe updated value of num is " + num + "\n");
    }
}
