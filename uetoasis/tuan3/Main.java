package uetoasis.tuan3;

public class Main {
    public static void main(String[] args) {
        Student test1 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");
        Student test2 = new Student("Nguyen Duy Hung", "1", "K62CC", "g");

        // System.out.println(test2.getInfo());

        System.out.println(StudentManagement.sameGroup(test1, test2));
    }
}
