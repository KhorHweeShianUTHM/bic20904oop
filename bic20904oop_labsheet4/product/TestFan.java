package product;

public class TestFan {
    
    public static void main(String[] args) {
        // Create two Fan objects
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        // Set attributes for the first fan
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Set attributes for the second fan
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Display the attributes of the first fan
        System.out.println("Fan 1:");
        System.out.println("Speed: " + fan1.getSpeed());
        System.out.println("Radius: " + fan1.getRadius());
        System.out.println("Color: " + fan1.getColor());
        System.out.println("On: " + fan1.isOn());

        // Display the attributes of the second fan
        System.out.println("\nFan 2:");
        System.out.println("Speed: " + fan2.getSpeed());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());
        System.out.println("On: " + fan2.isOn());
    }
}