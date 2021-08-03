// Use a string to control a switch statement.
class StringSwitch {
	public static void main(String args[]) {
		String command = "cancel";
		switch(command) {
			case "connect":
				System.out.println("Canceling");
				break;
			case "cancel":
				System.out.println("Canceling");
				break;
			case "disconnect":
				System.out.println("Disconnecting");
				break;
			default:
			System.out.println("Commans Error!");
		}
	}
}