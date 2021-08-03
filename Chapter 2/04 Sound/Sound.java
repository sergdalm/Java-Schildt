/*
	Проект 2.1.
	Вычисление расстояния до источника звука.
	в данном случае между тем, как наблюдатель увидит вспышку
	и услышит звук, проходит 7,2 секунды
*/

class Sound {
	public static void main(String args[]) {
		double dist;

		dist = 7.2 * 1100;

		System.out.println("The lightning is " + dist +
			" feet away.");

		dist = dist * 0.3048;

		System.out.println("The lightning is " + dist +
			" meters away.");

	}
}