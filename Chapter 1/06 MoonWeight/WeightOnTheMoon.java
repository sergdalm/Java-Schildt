/* 
	 Программа вычисляет ваш вес на Луне
*/

class WeightOnTheMoon {
	public static void main(String args[]) {
		double EarthWeight, MoonWeight;

		EarthWeight = 62.4;
		MoonWeight = EarthWeight * 0.17;

		System.out.println("Your wight on Earth is " + EarthWeight + " kg");
		System.out.println("Your wight on the Moon is " + MoonWeight + " kg");
	}
}