// Add range to Vehicle.
class Vehicle {
	int passengers; //number of passengers
	int fuelcap; // fuel capacity in gallons
	int mpg; // fuel consumption in miles per gallon

	// Displae the range.
	int range() {
		return mpg * fuelcap;
	}
}

class RetMeth {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		int range1, range2;
		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// assign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		System.out.println("Minivan can carry " + minivan.passengers +
			" with range of " + minivan.range() + " miles.");
		System.out.println("Sportscar can carry " + sportscar.passengers +
			" with range of " + sportscar.range() + " miles."); 
	}
}