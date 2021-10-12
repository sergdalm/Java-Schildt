// Use an enum constructor, instance variable, and method.
enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed; // typical speed of each transport

    // Constructor
    Transport(int s) { speed = s; }

    int getSpeed() { return speed; }
}

class EnumDemo3 {
    public static void main(String args[]) {
        Transport tp;
        tp = Transport.TRUCK;
        
        System.out.println("tp: " + tp + ", speed is " + tp.getSpeed());

        // Display speed of an airplane.
        System.out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() + " miles per hour.\n");

        // Display all Transports and speeds
        System.out.println("All Transport speeds: ");
        for(Transport t : Transport.values())
            System.out.println( t + " typical speed is " + t.getSpeed() + " miles per hour.");
    }
}