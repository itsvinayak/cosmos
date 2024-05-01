// Problem: Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.
// Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}
//        k = 3
//        Output: 3 3 4 5 5 5 6

class MaximumOfAllSubarraysOfsizeK {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int n = arr.length;
        int k = 3;
        int ans[] = maximumOfAllSubarraysOfsizeKBruteForce(arr, n, k);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    static int[] maximumOfAllSubarraysOfsizeKBruteForce(int arr[], int n, int k) {
            int ansSize = n - k + 1;
            int ans[] = new int[ansSize];
            for(int i = 0; i < ansSize; i++) {
                int max = arr[i];
                for(int j = i; j < i + k; j++) {
                    if(arr[j] > max) {
                        max = arr[j];
                    }
                }
                ans[i] = max;
            }
        return ans;
    }

}





