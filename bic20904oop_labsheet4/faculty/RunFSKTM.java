package faculty;

public class RunFSKTM {
    public static void main(String[] args) {
        FSKTM faculty1 = new FSKTM(); // No-argument constructor is called
        faculty1.setAddress("Parit Raja");
        faculty1.setNumberofdepartment(3);
        faculty1.setOpenCloseHour(8, 5);

        System.out.println("We are located in " + faculty1.getAddress() +
                ". Currently, we have " + faculty1.getNumberofdepartment() +
                " departments. We operate from Sunday to Thursday from " +
                faculty1.getOpenHour() + "AM to " + faculty1.getCloseHour() + "PM.");
    }
}