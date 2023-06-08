package Java_Practice.Oop;

class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap obj = new swap();
        System.out.println("\nInitial Values");
        System.out.println("A:" + a + "  B:" + b);
        System.out.println("\nTry swapping in same class");
        localswapper(a, b);
        System.out.println("A:" + a + "  B:" + b);
        System.out.println("\nTry swapping in different class");
        obj.swapping(a, b);
        System.out.println("A:" + a + "  B:" + b);
    }

    static void localswapper(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class swap {
    void swapping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}