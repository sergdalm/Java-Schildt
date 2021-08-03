/*
	Проект 1.1
	Программа, преобразующая галлоны в литры.
*/


class GalToLit {
	public static void main(String args[]) {
		double gallons;
		double liters;

		gallons = 10;
		liters = gallons * 3.7854;

		System.out.println(gallons + " gallons is " + liters + " liters");
	}
}