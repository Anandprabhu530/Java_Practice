package Java_Practice.Oop;

public class nestedclass {
    static class hello {
        static void printer() {
            System.out.println("\nThis is a static function inside a static class");
        }

        void callable() {
            System.out.println("This is the non-static function inside a static class\n");
        }
    }

    public static void main(String[] args) {
        // hello obj1 = new hello();
        // as you can see we do not need objects to access the static contents
        hello.printer();
        hello obj1 = new hello();
        obj1.callable();
    }
}
