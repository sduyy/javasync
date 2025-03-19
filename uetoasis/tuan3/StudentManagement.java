package uetoasis.tuan3;

public class StudentManagement {
    

    public static boolean sameGroup(Student s1, Student s2) {
        String s1group = s1.getGroup();
        String s2group = s2.getGroup();
        if (s1group == s2group) {
            return true;
        } else {
            return false;
        }
    }
}
