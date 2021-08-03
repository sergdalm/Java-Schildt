class Pwr {
	double b;
	int e;
	double val;

	// b(base) and e(ext) to demonstrate usege of this
	// this is used to “uncover” the instance variables
	Pwr(double b, int e) {
		this.b = b;
		this.e = e;

		this.val = 1;
		if(e == 0) return;
		for ( ; e > 0; e--) this.val = this.val * b;
	}
	
	double get_pwr() {
		return this.val;
	}
}

class DemoPwr {
	public static void main(String args[]) {
		Pwr x = new Pwr(4.0, 2);
		Pwr y = new Pwr(2.5, 1);
		Pwr z = new Pwr(5.7, 0);

		System.out.println(x.b + " rased to the " + x.e +
			" power is " + x.get_pwr());
		System.out.println(y.b + " rased to the " + y.e +
			" power is " + y.get_pwr());
		System.out.println(z.b + " rased to the " + z.e +
			" power is " + z.get_pwr());
	}
}