public class OopsQus {
    public static void main(String[] args) {
        Vehicle ob1 = new Car();
        ob1.print(); // OUTPUT = Car is Child

        Car ob2 = new Vehicle(); // We can't make parent class obj or Car refernce
        ob2.print();

        Vehicle ob3 = new Vehicle();
        ob3.print(); // OUTPUT = Vehicle Is Parent
    }
}

class Vehicle {
    void print() {
        System.out.println("Vechile Is Parent");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Car is Child");
    }
}
