package oop_labsheet04;

public class Patient {
    
    String patientID;
    String name;
    double height, weight, bmi;
    
    public void calcBMI(){
        bmi = weight / (height * height);
        System.out.println("BMI: " + String.format("%.2f", bmi) + "\n");
    }
    
    // B: Create two Constructor
    // no-argument constructor - must same named with class
    public Patient() {
        this.patientID = "P001";
        this.name = "Khor";
        this.height = 1.60;
        this.weight = 55.0;
    }
    
    // parameterized constructor - must same named with class
    public Patient(String patientID, String name, double height, double weight) {
        this.patientID = patientID;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {
        // A: Create instances and assign values
        Patient patient1 = new Patient();
        Patient patient2 = new Patient("P002", "Masidah", 1.80, 48.0);
        
        // C: Display details of both patients
        System.out.println("--- Patient 1 Info ---");
        System.out.println("ID: " + patient1.patientID);
        System.out.println("Name: " + patient1.name);
        patient1.calcBMI();
        
        System.out.println("--- Patient 2 Info ---");
        System.out.println("ID: " + patient2.patientID);
        System.out.println("Name: " + patient2.name);
        patient2.calcBMI();
    }
}