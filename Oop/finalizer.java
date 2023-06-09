package Java_Practice.Oop;

public class finalizer {
    public static void main(String[] args) {
        // The garbage collector will automatically delete the objects in java
        // in we c we use destructor to free the memory.
        // it is automatically done by java for us. We cannot delete the object but we
        // can specify what to do when gc is called
        // this can be done using the finalize();
        sample obj = new sample(0, "hello");
        for (int i = 0; i < 100000; i++) {
            System.out.println("Object is being created");
            obj = new sample(1, "defalut");
        }
        System.out.println(obj.a + " " + obj.name);
    }
}

class sample {
    int a;
    String name;

    sample(int num, String fullname) {
        this.a = num;
        this.name = fullname;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being destroyed");
    }
}