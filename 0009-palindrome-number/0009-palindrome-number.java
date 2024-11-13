class Solution {
    public boolean isPalindrome(int x) {
       int originalNum = x;
       int rev = 0;

       if (x < 0){
        return false;
       }

       while (x > 0){
        int lastDigit = x % 10;
        x = x / 10;
        rev = (rev * 10) + lastDigit;
       }

       if(originalNum == rev){
        return true;
       }
       else{
        return false;
       }
    }
}