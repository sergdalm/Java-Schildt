// Use substring().
class SubStr {
	public static void main(String args[]) {
		String orgstr = "Java makes the Web move.";

		// constrcut a substring
		// This creats a new string that contains the desired substring.
		String substr = orgstr.substring(5, 18);

		System.out.println("orgstr: " + orgstr);
		System.out.println("substr: " + substr);
	}
}