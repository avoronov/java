import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


public class Main {

    private static boolean isValid(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (charFrequency.containsKey(ch))
                charFrequency.put(ch, charFrequency.get(ch) + 1);
            else
                charFrequency.put(ch, 1);
        }
        
        Set<Integer> uniqueFreqs = new HashSet<>(charFrequency.values());
        
        return uniqueFreqs.size() == 1;
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

