package Java_Practice.Oop.Inheritance;

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Fuel obj = new Fuel();
        obj.biker();
        obj.engine_power();
        obj.fuel_rate();
    }
}

class Bike {
    void biker() {
        System.out.println("This is a Super Bike");
    }
}

class Engine extends Bike {
    void engine_power() {
        System.out.println("This is a high Capacity Engine");
    }

}

class Fuel extends Engine {
    void fuel_rate() {
        System.out.println("This is a petrol bike");
    }
}
