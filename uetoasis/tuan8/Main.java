package uetoasis.tuan8;

public class Main {
    public static void main(String[] args) {
        Person test = new Person("Nguyen Van A", "144 Xuan Thuy, Cau Giay, HN");
        Vehicle testc = new Car("Mercedes-Benz", "S400", "30A - 888.88", test, 4);
        Vehicle testm = new MotorBike("Yamaha", "YZF-R6", "29 - P1 686.68", test, false);
        test.addVehicle(testc);
        test.addVehicle(testm);

        System.out.println(testc.getInfo());
        // System.out.println(test.getVehiclesInfo());
    }
}
