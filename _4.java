import java.util.List;
import java.util.*;
// FIRST HARD PPROBLEM (6ms)
//Used Arraylist and .sort

public class _4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        List<Integer> abc = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            abc.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            abc.add(nums2[i]);
        }
        int mid = (abc.size()) / 2;
        System.out.println(abc);
        Collections.sort(abc);
        if (abc.size() % 2 == 0) {

            int mid2 = mid - 1;
            System.out.println(mid);
            System.out.println(abc.get(mid));
            System.out.println(abc.get(mid2));
            double a = abc.get(mid);
            double b = abc.get(mid2);

            median = ((double) abc.get(mid) + (double) abc.get(mid2)) / 2;
            return median;
        } else {
            median = abc.get(mid);
            return median;
        }

    }

    public static void main(String[] args) {
        // System.out.println(findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3,
        // 4 }));
        findMedianSortedArrays2(new int[] { 1, 2 }, new int[] { 3, 4 });
    }
    // Optimal Solution(1ms)
    // Used int[] array and not ArrayList
    // Sorted the merged array whilst adding elements from nums1 and nums2 in first
    // while loop
    // Other 2 while loops used to add remaining elements (positions of i and j does
    // get saved)
    // Afterwards same finding mid and returning median

    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] merged = new int[n];

        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }
        if (n % 2 == 0) {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        } else {
            return merged[n / 2];
        }
    }
}
