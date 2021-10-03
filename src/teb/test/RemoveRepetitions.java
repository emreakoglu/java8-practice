package teb.test;

public class RemoveRepetitions {
    public static String transform(String input) {
    	
    	String reduced = "";
    	
    	for(int i=0;i<input.length()-1;i++) {
    		
    		if (input.charAt(i) != input.charAt(i+1)) {
    			reduced = reduced + input.charAt(i);
    		}if (i+1 == (input.length()-1)) {
    			reduced = reduced + input.charAt(input.length()-1);
    		}
    		
    	}
    	return reduced;
    	
    	
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {
        System.out.println(RemoveRepetitions.transform("abbcbbbccdd"));        
    }
}