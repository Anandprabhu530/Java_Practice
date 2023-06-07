package Java_Practice.Oop.Inheritance;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        low_cc obj1 = new low_cc();
        obj1.Biker_();
        obj1.Biker();
        high_cc obj2 = new high_cc();
        obj2.Biker_();
        obj2.Biker();
        medium_cc obj3 = new medium_cc();
        obj3.Biker_();
        obj3.Biker();
    }
}

class Bike {
    void Biker_() {
        System.out.println("This is a Bike");
    }
}

class low_cc extends Bike {
    void Biker() {
        System.out.println("This is a Low CC Bike");
    }
}

class medium_cc extends Bike {
    void Biker() {
        System.out.println("This is a Medium CC Bike");
    }
}

class high_cc extends Bike {
    void Biker() {
        System.out.println("This is a High CC Bike");
    }
}
