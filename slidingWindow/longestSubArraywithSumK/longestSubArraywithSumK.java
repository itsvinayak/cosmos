
// longest subarray with sum k, given an array of integers and a number k, find the longest subarray with sum k.
// example:
// arr[] = {10, 5, 2, 7, 1, 9}
// k = 15
// output: 4


class longestSubArraywithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int n = 6;
        System.out.println(longestSubArraywithSumK(arr, n, k));
    }
    static int longestSubArraywithSumK(int[] arr, int n, int k){
        int max_len = 0;
        int current_sum = 0;
        int start = 0, end = 0;
        while(end < n){
            current_sum += arr[end];
            if(current_sum < k){
                end++;
            }
            else if(current_sum == k){
                max_len = Math.max(max_len, end - start + 1);
                end++;
            }
            else{
                while(current_sum > k){
                    current_sum -= arr[start];
                    start++;
                }
                if(current_sum == k){
                    max_len = Math.max(max_len, end - start + 1);
                }
                end++;
            }
        }
        return max_len;
    }
}
