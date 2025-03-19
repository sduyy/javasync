package uetoasis.tuan3;

public class StudentManagement {
    private Student[] students = new Student[100];
    private int count = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }
    
    public void addStudent(Student newStudent) {
        if (this.count < 100) {
            this.students[this.count] = newStudent;
            ++this.count;
        }
    }

    
}
