public class Main {

    public static void main(String[] args){
        int[] nums1 = new int[] {2,0};
        int m = 1;

        int[] nums2 = new int[] {1};
        int n = 1;

        merge(nums1, m, nums2, n);

        for (int num : nums1)
        {
            System.out.print(num + " ");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        // Two integer values that track the position within the arrays
        int p1 = m - 1;
        int p2 = n - 1;

        // For loop that starts at the end of the array and iterates to the start
        for (int i = (m + n) - 1; i >= 0; i--)
        {
            // if p2 is less than zero there are no more numbers to merge into nums1 and method returns
            if (p2 < 0)
            {
                return;
            }
            else if (p1 >= 0 && nums1[p1] > nums2[p2]) // if p1 is in range of nums1 values are compared
            {
                nums1[i] = nums1[p1]; // if nums1 p1 is larger than nums2 p2 nums1 is placed at nums1 index i
                p1--;
            }
            else
            {
                nums1[i] = nums2[p2];// nums2 p2 is placed at nums1 index i
                p2--;
            }
        }
    }
}