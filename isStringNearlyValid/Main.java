
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;


public class Main {

    private static boolean isValid(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (charFrequency.containsKey(ch))
                charFrequency.put(ch, charFrequency.get(ch) + 1);
            else
                charFrequency.put(ch, 1);
        }
        
        SortedMap<Integer, Integer> frequencyFreq = new TreeMap<>();
        for (Integer freq : charFrequency.values()) {
            if (frequencyFreq.containsKey(freq))
                frequencyFreq.put(freq, frequencyFreq.get(freq) + 1);
            else
                frequencyFreq.put(freq, 1);
        }

        if (frequencyFreq.size() == 1) {
            return true;
        }
        else if (frequencyFreq.size() != 2) {
            return false;
        }
        else {
            Integer minFreq = frequencyFreq.firstKey();
            Integer maxFreq = frequencyFreq.lastKey();
            
            if (maxFreq != minFreq + 1) {
                return false;
            }

            if (frequencyFreq.get(maxFreq) != 1) {
                return false;
            }

            return true;
        }
    }

	public static void main(String[] args) {
	    System.out.println("Enter string:");
        Scanner input = new  Scanner(System.in);
        while (input.hasNextLine()) {
            String str = input.next();
            if (Objects.equals("exit", str)) {
                System.out.println("Bye!");
                break;
            }
            if (isValid(str)) {
                System.out.println("String is valid");
            }
            else {
                System.out.println("String is not valid");
            }
        }	
        input.close();	
	}
}

