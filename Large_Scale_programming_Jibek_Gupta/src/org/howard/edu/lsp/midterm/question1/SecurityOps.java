package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public static String encrypt(String text){
        // Eliminate characters except letters (a-z, A-Z) and digits (0-9)
        String sanitizedText = "";
        for (char c : text.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                sanitizedText += c;
            }
        }

        // Split string based on character position (even/odd)
        String evenChars = "";
        String oddChars = "";
        for (int i = 0; i < sanitizedText.length(); i++) {
            if(i % 2 == 0){
                evenChars += sanitizedText.charAt(i);
            } else {
                oddChars += sanitizedText.charAt(i);
            }
        }

        // Combine characters at even and odd positions into a single string.
        return evenChars + oddChars;
    }
    
    public static void main(String[] args) {
        // Execute test cases for the encrypt method to validate its behavior
        String result = encrypt("I love CSCI363");
        System.out.println(result); 
    }
}
