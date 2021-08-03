// Program uses an array to find the average of 10 double values
class DubArr {
	public static void main(String args[]) {
		double x[] = new double[10];
		double d = 0.2;

		// Initilize the array
		for(int i = 0; i < x.length; i++) {
			x[i] = d;
			System.out.println("x[" + i + "] is " + x[i]);
			d *=2;
		}

		double sum = 0;
		double average;
		for(double z : x) 
			sum += z;
		average = sum / x.length;
		System.out.println("Average is " + average);

	}
}