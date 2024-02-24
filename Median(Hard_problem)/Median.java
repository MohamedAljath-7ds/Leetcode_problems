import java.util.Arrays;

class Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // merge two array
        int a = nums1.length;
        int b = nums2.length;
        int c = a + b;
        int merged[] = new int[c];
        System.arraycopy(nums1, 0, merged, 0, a);
        System.arraycopy(nums2, 0, merged, a, b);
        Arrays.sort(merged);
        if (merged.length % 2 == 0) {
            // If the array length is even
            int mid = merged.length / 2;
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            // If the array length is odd
            return merged[merged.length / 2];
        }

    }
}