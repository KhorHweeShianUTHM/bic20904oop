package oop_labsheet04;

public class Laptop {
    
    String cpu;
    double ram, ssd;
    
    public Laptop(){
        this.cpu = "Intel i7";
        this.ram = 16;
        this.ssd = 512;
    }
    
    public Laptop(String cpu, double ram, double ssd){
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }
    
    public static void main (String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("AMD Ryzen 5", 8, 256);
        
        System.out.println("--- Laptop 1 Info ---");
        System.out.println("CPU: " + laptop1.cpu);
        System.out.println("RAM: " + laptop1.ram);
        System.out.println("SSD: " + laptop1.ssd);
        System.out.println();
        
        System.out.println("--- Laptop 2 Info ---");
        System.out.println("CPU: " + laptop2.cpu);
        System.out.println("RAM: " + laptop2.ram);
        System.out.println("SSD: " + laptop2.ssd);
    }
}