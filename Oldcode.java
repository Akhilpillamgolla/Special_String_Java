package assement_1;

public class Oldcode {

		public static void main(String[] args) {
			String input = "I am very Happy today is monday its my joining day";
			String regex = "\\s+";
			String result = input.replaceAll(regex, " ");
			String output = replaceWhiteSpace(result);
			System.out.println(output);
		}

		public static String replaceWhiteSpace(String input) {
			StringBuilder result = new StringBuilder();
			int Count = 0;
			
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (Character.isWhitespace(c)) {
					result.append(getReplacementString(Count));
					Count++;
				} else {
					result.append(c);
				}
			}
			return result.toString();
		}

		public static String getReplacementString(int space) {
			StringBuilder replacement = new StringBuilder();
			char var = space % 2 != 0 ? '#' : '*';
			for (int i = 0; i <= space; i++) {
				replacement.append(var);
			}
			return replacement.toString();
		}
	}

