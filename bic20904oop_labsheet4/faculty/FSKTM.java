package faculty;

public class FSKTM {
    // Instance variables
    private String address;
    private int numberofdepartment;
    private int openhour;
    private int closehour;

    // No-argument constructor
    public FSKTM() {
        System.out.println("Welcome to FSKTM!");
    }

    // Mutators (Setters)
    public void setAddress(String a) {
        address = a;
    }

    public void setNumberofdepartment(int n) {
        numberofdepartment = n;
    }

    public void setOpenCloseHour(int o, int c) {
        openhour = o;
        closehour = c;
    }

    // Accessors (Getters)
    public String getAddress() {
        return address;
    }

    public int getNumberofdepartment() {
        return numberofdepartment;
    }

    public int getOpenHour() {
        return openhour;
    }

    public int getCloseHour() {
        return closehour;
    }
}