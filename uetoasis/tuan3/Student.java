package uetoasis.tuan3;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Constructor for student.
     */
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    /**
     * Empty constructor for student.
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
        this.group = "K62CB";
        this.email = email;
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

    /**
     * Get name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get ID.
     */
    public String getID() {
        return id;
    }

    /**
     * Set ID.
     */
    public void setID(String id) {
        this.id = id;
    }

    /**
     * Get group.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Set group.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Get email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get info.
     */
    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}
