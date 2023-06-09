package Java_Practice.Oop;

public class staticmethod {
    public static void main(String[] args) {
        // runnig();
        // cannot call a non-static method from a static method
        // To call a non-static methhod from a static method we must create an object;
        staticmethod obj = new staticmethod();
        System.out.println("\nThe Object has been created");
        // now i will be able to call the static method using the object obj as
        // reference
        obj.running();
    }

    void running() {
        System.out.println("The object is runinng when be call the running() method");
        sleeping();
    }

    void sleeping() {
        System.out.println("The Object is sleeping when we call the sleeping() method\n");
    }
}
