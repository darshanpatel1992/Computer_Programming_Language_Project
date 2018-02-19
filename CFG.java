/**
 * @author kaushilruparelia
 *
 */
public class CFG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Enter a valid input");
			return;
		}
		
		String[] input = args[0].split("→");
		
		if (input.length != 2) {
			System.out.println("Enter a valid input");
			return;
		}
		
		System.out.print(input[0] + " → ");
		
		separateNonTerminals(input[1].trim());
		
	}
	
	public static void separateNonTerminals(String grammar) {		
		char rule = grammar.charAt(0);
		String newGrammar = grammar.substring(1);
		
		
		if (isLowerCase(rule)) {
			System.out.print("<"+rule+">");
		}
		else if(newGrammar.length() >= 1){
			System.out.print(rule);
		}
		
		if (containsLowerCase(newGrammar)) {
			System.out.println("<"+newGrammar+">");
		}
		else {
			System.out.println(newGrammar);
		}
		
		if (isLowerCase(rule)  && !newGrammar.equals("")) {
			System.out.println("<"+rule+"> → "+rule);
		}
		
		if ((newGrammar.length() > 1 && containsLowerCase(newGrammar)) || (newGrammar.length() == 1 && isLowerCase(newGrammar.charAt(0)))) {
			System.out.print("<"+newGrammar+"> → ");
			separateNonTerminals(newGrammar);
		}
		
	}
	
	public static boolean isLowerCase(char c) {
		return c <= 122 && c >= 97;
	}
	public static boolean containsLowerCase(String s) {
		
		for (char c : s.toCharArray()) {
			if (isLowerCase(c)) {
				return true;
			}
		}
		return false;
	}

}
