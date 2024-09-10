public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};

        int retrunNum = removeDuplicates(nums);

        for (int i = 0; i < retrunNum; i++)
        {
            System.out.print(nums[i] + " ");
        }

    }

    public static int removeDuplicates(int[] nums) {
        // int to keep track of index to write at
        int position = 1;

        for (int i = 1; i < nums.length; i++)
        {   // if the number prior to current index is not equal the index is written at position
            if (nums[i-1] != nums[i])
            {
                nums[position] = nums[i];
                position++;
            }
        }
        return position; // returning the number of elements changed
    }
}