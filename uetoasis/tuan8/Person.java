import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * This is constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<Vehicle>();
    }

    /**
     * This is to add.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * This is to remove.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            Vehicle cur = vehicleList.get(i);
            if (cur.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(i);
            }
        }
    }

    /**
     * This is to get info.
     */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            return this.name + " has no vehicle!";
        } else {
            String s = this.name + " has:" + "\n\n";
            for (int i = 0; i < vehicleList.size(); i++) {
                Vehicle cur = vehicleList.get(i);
                s = s + cur.getInfo() + "\n";
            }
            return s;
        }
    }

    /**
     * This is to get.
     */
    public String getName() {
        return this.name;
    }

    /**
     * This is to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This is to get.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * This is to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
