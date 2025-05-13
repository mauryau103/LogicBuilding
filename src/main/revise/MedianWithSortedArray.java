package main.revise;

public class MedianWithSortedArray extends IsomorphicString {
    public static void main(String[] args) {
//        median(new int[]{1, 3}, new int[]{2});
        IsomorphicString isomorphicString = new MedianWithSortedArray();
        isomorphicString.isIsomorphic("a", "b");
    }

    public double median(int[] arr, int[] arr2) {
        int m = arr.length;
        int n = arr2.length;
        int[] ans = new int[m + n];

        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < m && j < n) {
            ans[idx++] = arr[i] < arr2[j] ? arr[i++] : arr2[j++];
        }

        while (i < m) {
            ans[idx++] = arr[i++];
        }

        while (j < n) {
            ans[idx++] = arr2[j++];
        }

        if (ans.length % 2 != 0)
            return ans[ans.length / 2];

        return (double) (ans[ans.length / 2] + ans[(ans.length / 2) - 1]) / 2;
    }

    public static double median2() {
        return 0;
    }
}
