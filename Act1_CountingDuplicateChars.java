/**
 * 
 */
package _CountingDuplicateChars_;
import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Act1_CountingDuplicateChars {

	
	public static void main(String[] args) {
		String input = "SamSamEE";
		HashMap<Character, Integer> countDuplicateMap = new HashMap<>() ;
		
		char[] charArray = input.toCharArray();
		
		for(char c: charArray) {
			
				if(countDuplicateMap.containsKey(c)) {
					
					countDuplicateMap.put(c, countDuplicateMap.get(c) + 1);
				}else{
					
					countDuplicateMap.put(c, 1);
					
				}
		}
		for(Entry<Character, Integer> entry : countDuplicateMap.entrySet()){
		
				if(entry.getValue() > 1) {
				
			System.out.println(entry.getKey() + " : " + entry.getValue());
				}
		}
	}

}
