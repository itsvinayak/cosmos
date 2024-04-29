// Problem: Find the smallest subarray with sum greater than a given value
// Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.
// Examples:
// arr[] = {1, 4, 45, 6, 0, 19}
//   x  =  51
//   Output: 3


class smallestSubarrayWithSumGreaterThanAGivenValue {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x = 51;
        int n = 6;
        System.out.println(smallestSubarrayWithSumGreaterThanAGivenValueBruteForce(arr, n, x));
        System.out.println(smallestSubarrayWithSumGreaterThanAGivenValue(arr, n, x));
    }
    static int smallestSubarrayWithSumGreaterThanAGivenValueBruteForce(int[] arr, int n, int x){
        int max_len = n;
        int current_sum = 0;
        for(int i = 0; i < n - 1 ; i++){
            current_sum = arr[i];
            if(current_sum > x){
                return 1;
            }
            for(int j = i + 1 ; j < n; j++){
                current_sum += arr[j];
                if(current_sum > x && (j - i + 1) < max_len){
                    max_len = j - i + 1;
                }
            }
        }
        return max_len;
    }
    static int smallestSubarrayWithSumGreaterThanAGivenValue(int[] arr, int n, int x){
            int max_len = n+1;
            int current_sum = 0;
            int start = 0, end = 0;
            while(end < n) {
                while(current_sum <= x && end < n){
                    current_sum += arr[end++];
                }
                while(current_sum > x && start < n){
                    if(end - start < max_len){
                        max_len = end - start;
                    }
                    current_sum -= arr[start++];
                }
            }
            return max_len;
        }
}
