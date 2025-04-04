package uetoasis.tuan5.kethua2;

public class Person {
    private String name;
    private String address;

    /**
     * This is constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * This is to get name.
     */
    public String getName() {
        return name;
    }

    /**
     * This is to set name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This is to get address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * This is to set address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This is to string.
     */
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]"; 
    }
}
