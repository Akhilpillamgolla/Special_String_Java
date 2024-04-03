package assement_1;

public class SpecialString2 {
	public static void main(String[] akhil) { // we can change ARGS to any thing

		String input = akhil[0] + "\n" + akhil[1] + " " + "\n" + akhil[2] + " " + akhil[3];
		// we can't give data more than specified akhil[]
		String regex = "\\s+";
		String result = input.replaceAll(regex, " ");
		String output = replaceWhiteSpace(result);
		System.out.println(output);

	}

	public static String replaceWhiteSpace(String input) {
		StringBuilder result = new StringBuilder();

		int spacecount = 0;

		for (char c : input.toCharArray()) {
			if (Character.isWhitespace(c)) {
				result.append(getReplacementString(spacecount));
				spacecount++;
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}

	public static String getReplacementString(int space) {
		StringBuilder replacement = new StringBuilder();

		char variable = space % 2 != 0 ? '#' : '*';
		for (int i = 0; i <= space; i++) {
			replacement.append(variable);
		}

		return replacement.toString();
	}
}