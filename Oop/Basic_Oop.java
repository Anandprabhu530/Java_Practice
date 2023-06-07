package Java_Practice.Oop;

public class Basic_Oop {
    public static void main(String[] args) {
        laptop obj1 = new laptop("Intel", 8, 256);
        laptop obj2 = new laptop("Ryzen", 16, 512);
        System.out.println("\nThe object1 has the processor " + obj1.Processor + " with a " + obj1.RAM + " ram and a "
                + obj1.SSD + "gb storage.");
        System.out.println("The object2 has the processor " + obj2.Processor + " with a " + obj2.RAM + " ram and a "
                + obj2.SSD + "gb storage.");
        System.out.println("\nIf the defalut constructor is called we get ");
        laptop obj3 = new laptop();
        System.out.println("The object3 has the processor " + obj3.Processor + " with a " + obj3.RAM + " ram and a "
                + obj3.SSD + "gb storage.\n");
    }
}

class laptop {
    String Processor;
    int RAM;
    int SSD;

    laptop(String processor, int ram, int ssd) {
        this.Processor = processor;
        this.RAM = ram;
        this.SSD = ssd;
    }

    laptop() {
        this.Processor = "Defalut";
        this.RAM = 0;
        this.SSD = 0;
    }
}