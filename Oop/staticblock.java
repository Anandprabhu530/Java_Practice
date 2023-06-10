package Java_Practice.Oop;

public class staticblock {
    public static void main(String[] args) {
        output obj1 = new output();
        System.out.println("A:" + output.a + " B:" + output.b + "\n");
        output.b += 10;
        System.out.println("A:" + output.a + " B:" + output.b + "\n");
        output obj2 = new output();
        System.out.println("A:" + output.a + " B:" + output.b + "\n");
        System.out.println(
                "As you see the value didnt get doubled since the doubling code is given inside\nthestatic block which executes only once\n");
    }
}

class output {
    static int a = 2;
    static int b;
    static int i = 1;
    static {
        b = a * a;
        System.out.println("This the " + i++ + "-st static block is called\n");
    }
}