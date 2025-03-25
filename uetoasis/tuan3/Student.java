package uetoasis.tuan3;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
 
    /**
     * Constructor for student.
     */
    public Student() {
       this.name = "Student";
       this.id = "000";
       this.group = "K62CB";
       this.email = "uet@vnu.edu.vn";
    }
 
    /**
     * Constructor for student.
     */
    public Student(String name, String id, String email) {
       this.name = name;
       this.id = id;
       this.email = email;
       this.group = "K62CB";
    }
 
    /**
     * Constructor for student.
     */
    public Student(Student s) {
       this.name = s.name;
       this.id = s.id;
       this.group = s.group;
       this.email = s.email;
    }
 
    public void setName(String name) {
       this.name = name;
    }
 
    public String getName() {
       return this.name;
    }
 
    public void setGroup(String group) {
       this.group = group;
    }
 
    public String getGroup() {
       return this.group;
    }
 
    public void setId(String id) {
       this.id = id;
    }
 
    public String getId() {
       return this.id;
    }
 
    public void setEmail(String email) {
       this.email = email;
    }
 
    public String getEmail() {
       return this.email;
    }
 
    public String getInfo() {
       String var10000 = this.getName();
       return var10000 + " - " + this.getId() + " - " + this.getGroup() + " - " + this.getEmail();
    }
 }
 