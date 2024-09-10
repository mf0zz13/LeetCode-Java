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

        int p1 = m - 1;
        int p2 = n - 1;

        for (int i = (m + n) - 1; i >= 0; i--)
        {
            if (p2 < 0)
            {
                return;
            }
            else if (p1 >= 0 && nums1[p1] > nums2[p2])
            {
                nums1[i] = nums1[p1];
                p1--;
            }
            else
            {
                nums1[i] = nums2[p2];
                p2--;
            }
        }
    }
}