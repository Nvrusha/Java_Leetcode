class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove all non-alphanumeric characters
        String newStr = s.toLowerCase().replaceAll("[^a-z0-9]","");

        // Initialize an empty string to store the reversed string
        String revStr = "";

        // Loop through the string from the end to the beginning
        for(int i = newStr.length() - 1; i >= 0; i--){  

            // Append each character to the reversed string 
            revStr += newStr.charAt(i);
        }

       // Check if the original string (without non-alphanumeric characters) is equal to its reversed version
       return newStr.equals(revStr);
    }
}