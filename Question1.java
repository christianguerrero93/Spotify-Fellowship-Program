public class Question1 {

	public static String sortByStrings(String s, String t) {
		
		String result = "";
		
		for (int i = 0; i < t.length(); i++) {
			
			for (int j = 0; j < s.length(); j++) {
				
				if (s.charAt(j) == t.charAt(i)) {
					
					result += t.charAt(i);
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String s = "weather";
		String t = "therapyw";

		String answer = sortByStrings(s,t);
		
		System.out.println(answer);
	}

}