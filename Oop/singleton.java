package Java_Practice.Oop;

class main {
    public static void main(String[] args) {
        singleton obj1 = singleton.getinstance();
        singleton obj2 = singleton.getinstance();
        singleton obj3 = singleton.getinstance();
        System.out.println("\nProgram completed.The constructor is called only once if we have created 3 objects \n");
    }
}

class singleton {
    private singleton() {
        System.out.println("Object created");
    }

    private static singleton instance;
    static int i = 1;

    public static singleton getinstance() {
        if (instance == null) {
            System.out.println("\nThe constructor of instance is being called");
            instance = new singleton();
        }
        System.out.println(i++ + " - object created");
        return instance;
    }
}