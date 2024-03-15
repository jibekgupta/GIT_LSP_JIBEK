package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public static String encrypt(String text){
        // Remove non-letter and non-digit characters
        String sanitizedText = "";
        for (char c : text.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                sanitizedText += c;
            }
        }

        // Separate even and odd-indexed characters
        String evenChars = "";
        String oddChars = "";
        for (int i = 0; i < sanitizedText.length(); i++) {
            if(i % 2 == 0){
                evenChars += sanitizedText.charAt(i);
            } else {
                oddChars += sanitizedText.charAt(i);
            }
        }

        // Concatenate even and odd-indexed characters
        return evenChars + oddChars;
    }
    
    public static void main(String[] args) {
        // Test the encrypt method
        String result = encrypt("I love CSCI363");
        System.out.println(result); // Output should be "IoeS16lvCC33"
    }
}
