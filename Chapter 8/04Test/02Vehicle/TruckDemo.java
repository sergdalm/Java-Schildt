// Try This 7-1
//
// Build a subclass of Vehicle for trucks.

interface IVehicle {
    int range();
    double fuelneeded(int miles);
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}

class Vehicle implements IVehicle{
	private int passengers; //number of passengers
	private int fuelcap; // fuel capacity in gallons
	private int mpg; // fuel consumption in miles per gallon

	// This is a constructor for Vehicle.
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Retern the range.
	public int range() {
		return mpg * fuelcap;
	}

	// Compute fuel needed for a given distance.
	public double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

    // Accessor methods for instance variables.
    public int getPassengers() { return passengers; }
    public void setPassengers(int p) { passengers = p; }
    public int getFuelcap() { return fuelcap; }
    public void setFuelcap(int f) { fuelcap = f; }
    public int getMpg() { return mpg; }
    public void setMpg(int m) { mpg = m; }
}

// Extend Vehicle to create a Truck specialization.
class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds

    // This is a contructor for Truck.
    Truck(int p, int f, int m, int c) {
        /*  Initialize Vehicle members using 
            Vehicle's constructor  */
            super(p, f, m);
            
            cargocap = c;
    }

    // Accessor methods for cargocap.
    void putCargo(int c) { cargocap = c; }
    int getCargo() { return cargocap; }
}

class TruckDemo {
	public static void main(String args[]) {
        // construct some trucks
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

		gallons = semi.fuelneeded(dist);

		System.out.println("Semi can caryy " + semi.getCargo() +
            " puounds. ");
		
		System.out.println("To go " + dist + " miles semi needs " +
			gallons + " gallons of fuel.");
        
        gallons = pickup.fuelneeded(dist);

        System.out.println("Pickup can caryy " + pickup.getCargo() +
                " puounds. ");
            
        System.out.println("To go " + dist + " miles pickup needs " +
            gallons + " gallons of fuel.");
	}
}