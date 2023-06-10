package Java_Practice.Oop;

public class superkey {
    public static void main(String[] args) {
        System.out.println("\nThe base class objects contains");
        company obj1 = new company("Taxophone_3", 12323, 20000.0f);
        System.out.println("Mobile Name :" + obj1.name + ",Model No :" + obj1.modelno + ",Price :" + obj1.price);
        System.out.println("\nAccessing the parent class constructor through super keyword");
        smartphone obj2 = new smartphone("Fruit_phone_3", 124123, 35553.0f, "Snapdragon 8+ gen 2");
        System.out.println("Mobile Name :" + obj2.name + ",Model No :" + obj2.modelno + ",Price :" + obj2.price
                + ",Processor :" + obj2.processor + "\n");
    }
}

class company {
    String name;
    int modelno;
    float price;

    company(String Name, int Model_Number, float Price) {
        this.name = Name;
        this.modelno = Model_Number;
        this.price = Price;
    }
}

class smartphone extends company {
    String processor;

    smartphone(String Name, int Model_Number, float Price, String Processor) {
        super(Name, Model_Number, Price);
        this.processor = Processor;
    }
}