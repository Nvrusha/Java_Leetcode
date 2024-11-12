class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Get the length of the 'nums' array and store it in variable 'n'
        int n = nums.length;

        // Outer loop iterates through each element in 'nums' from index 0 to n-2
        // The '-1' ensures we don't go out of bounds when checking pairs
        for(int i = 0; i < n-1; i++){

            // Inner loop starts from the element after 'i' and goes up to the last element
            // This ensures we only consider pairs and avoid duplicate index checks
            for(int j = i + 1; j < n; j++){

                // Check if the sum of elements at indices 'i' and 'j' equals 'target'
                if(nums[i] + nums[j] == target){

                     // If condition is true, return an array containing the indices 'i' and 'j'
                    return new int []{i,j};
                }
            }
        }
        return new int[]{};
        
    }
}