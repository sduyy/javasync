package uetoasis.tuan3;

public class StudentManagement {
   private Student[] students = new Student[100];
   private int cnt = 0;

   public StudentManagement() {
   }

   public static boolean sameGroup(Student s1, Student s2) {
      return s1.getGroup().equals(s2.getGroup());
   }

   /**
    * This is to add student.
    */
   public void addStudent(Student newStudent) {
      if (this.cnt < 100) {
         this.students[this.cnt] = new Student(newStudent);
         ++this.cnt;
      }

   }

   /**
    * This is to return students by group.
    */
   public String studentsByGroup() {
      StringBuilder res = new StringBuilder();
      String[] groups = new String[100];
      int curGroupidx = 0;

      int i;
      for (i = 0; i < this.cnt; ++i) {
         String curGroup = this.students[i].getGroup();
         boolean found = false;

         for (int j = 0; j < curGroupidx; ++j) {
            if (groups[j].equals(curGroup)) {
               found = true;
               break;
            }
         }

         if (!found) {
            groups[curGroupidx] = curGroup;
            ++curGroupidx;
         }
      }

      for (i = 0; i < curGroupidx; ++i) {
         res.append(groups[i]).append("\n");

         for (int j = 0; j < this.cnt; ++j) {
            if (this.students[j].getGroup().equals(groups[i])) {
               res.append(this.students[j].getInfo()).append("\n");
            }
         }
      }

      return res.toString();
   }

   /**
    * This is to remove student.
    */
   public void removeStudent(String id) {
      int temporary = 0;

      int i;
      for (i = 0; i < this.cnt; ++i) {
         if (this.students[i].getId().equals(id)) {
            temporary = i;
            break;
         }
      }

      for (i = temporary; i < this.cnt - 1; ++i) {
         this.students[i] = this.students[i + 1];
      }

      this.students[this.cnt - 1] = null;
      --this.cnt;
   }
}
