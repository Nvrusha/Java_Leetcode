class Solution {
    public boolean isPalindrome(int x) {

       int originalNum = x; // We need this original value for comparison after we reverse the number
       int rev = 0;   // Initialize a variable to store the reversed number

       // Check if the number is negative; negative numbers cannot be palindromic
       // because the minus sign would appear only on one side, making it asymmetrical
       if (x < 0){
        return false;
       }

       // Start a loop to reverse the digits of the number x
       // This loop continues until there are no more digits left in x (x > 0)
       while (x > 0){

        // Extract the last digit of x using modulus operator (%)
        int lastDigit = x % 10;

        // Remove the last digit from x by dividing it by 10
        x = x / 10;

        // Add the last digit to rev, shifting rev left by one position
        rev = (rev * 10) + lastDigit;
       }

       // Check if the reversed number is the same as the original
       // Return true if they are equal, false otherwise
       return originalNum == rev;
    }
}