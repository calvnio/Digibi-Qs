package Q1;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramDetection {
	
	public static void allPermutations(String str, String newQuery, HashMap<String,Boolean> queryAnagram) { 
        if (str.length() == 0) { 
            queryAnagram.put(newQuery, true);
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            String ros = str.substring(0, i) + str.substring(i + 1); 
            allPermutations(ros, newQuery + ch, queryAnagram); 
        } 
    } 
    
	public static int anagramDetection(HashMap<String,Boolean> queryAnagram, String parent, int queryLength) {
    	int result = 0;
    	int parentLength = parent.length();
    	for (int i=0; i < parentLength-queryLength+1; i++) {
    		if (queryAnagram.get(parent.substring(i, i+queryLength)) != null) 
    			result++;
    	}
    	return result;
    }
    
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String parent= sc.next();
		String query = sc.next();
		if (query.length() < parent.length()) {
			HashMap<String, Boolean> queryAnagram = new HashMap<>();
			allPermutations(query, "", queryAnagram);
			System.out.println(anagramDetection(queryAnagram, parent, query.length()));
		} else
			System.out.println("Query string is longer than parent string");
	}
}
