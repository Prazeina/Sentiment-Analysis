
package mainlogic;

import java.util.regex.Pattern;

public class RemovePunctuation {
	
	public static String removeStopWord(String word) {
		
		String result = word.replaceAll("\\.", "");
		result = result.replaceAll("\\,", "");
		result = result.replaceAll("\\?", "");
		result = result.replaceAll("\\!", "");
		result = result.replaceAll("\\@", "");
		result = result.replaceAll("\\#", "");
		result = result.replaceAll("\\$", "");
		result = result.replaceAll("\\%", "");
		result = result.replaceAll("\\&", "");
		result = result.replaceAll("\\:", "");
		result = result.replaceAll("\\;", "");
		result = result.replaceAll("\\-", "");
		result = result.replaceAll("\\''", "");
		
		
		return result;
	}

}


