// Problem Statement: Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
// Example: Input: [1, 2, 3, 4, 5, 6, 7, 8], k=3
// Output: 21
// Explanation: [6, 7, 8] is the subarray with maximum maxSumOfSubArraysOfSizeK of size 3.

class maxSumOfSubArraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        System.out.println(maxSumOfSubArraysOfSizeK(arr, k));
    }

    public static int maxSumOfSubArraysOfSizeK(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - k + 1; i++) {
            int sum = 0;
            for(int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
