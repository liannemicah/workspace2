package Projects;
import java.util.Scanner;//will allow to scan the input
public class CeasarCipher {

	public static void main(String[] args) {
		
		//tells user to enter an input and the shift value
		System.out.println("Type in a word or a sentence, just anything, but no punctuation. The result will be encrypted.");
		Scanner message = new Scanner(System.in);//takes in the input to scan
	    String str = message.nextLine();//takes input into the str String variable
	    System.out.println("What's the shift value?");
	    int shiftValue = message.nextInt();//takes the input to scan the shift value
	    
	    System.out.println("Encrypted Message: ");//lets user know their message is encrypted 
 
	    String encryptedText = encrypt(str, shiftValue);//encrypted input will be stored into a String variable
	    System.out.println(encrypt(str, shiftValue));//prints the encrypted message
	    
	    System.out.println();//just a spacer so the output will look nice 
	    
	  	System.out.println("Decrypted Message: ");//lets user know their message is decrypted 
		System.out.println(decrypt(encryptedText, shiftValue));//prints the original/decrypted message
		
		message.close();//closes the message
		
	    System.out.println();//another spacer
		System.out.println("Message successfully decrypted, yay.");

	}//end static void
	
    public static String encrypt(String str, int shiftValue) {//a signature for the encryption method
    	String encrypted = "";//creates String variable encrypted
    	char c;//calls char variable c
    	//takes every single str character to encrypt
        for (int i = 0; i < str.length(); i++) { 
            c = str.charAt(i);
            // if c is letter ONLY then shift them, else directly add it
            if (Character.isLetter(c)) {
            	c = (char)(str.charAt(i) + shiftValue);// System.out.println(c);
            	encrypted += c;
            }
            
        }//end for loop
        
        return encrypted;
    	
    }//end public static String
    
    public static String decrypt(String encryptedText, int shiftValue) {//a signature for the decryption method
    	String decrypted = "";//creates String variable decrypted
    	char c;//calls char variable c
    	//takes every single encryptedText character to decrypt
    	for(int i = 0; i < encryptedText.length(); i++) {
    		c = encryptedText.charAt(i);
    		// if c is letter ONLY then shift them back the way how user types it in
    		if(Character.isLetter(c)) {
    			c = (char)(encryptedText.charAt(i) - shiftValue);//prints initial input
    			decrypted += c;
    		}
    		
    	}//end for loop
    	
    	return decrypted;
    	
    }//end public static String

}//end class
