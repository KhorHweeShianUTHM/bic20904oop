package oop_labsheet03;

public class TransportFee {

    // new method calculateNewFee
    static double calculateNewFee(double fee){
        
        double newFee = fee * 1.2;
        return newFee;
    }
    
    // static method calculateFee
    static double calculateFee(int d){
        
        double fee = d * 2.0;
        return fee;
    }
    
    public static void main(String[] args){
        int days = 21;
        double fee;
        double newFee;
        
        fee = calculateFee(days); // method call
        newFee = calculateNewFee(fee); // method call
        
        System.out.println("Fee for " + days + " days is RM " + fee);
        System.out.println("New Fee after increment is RM " + newFee);
    }
}
