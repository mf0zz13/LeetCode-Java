public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3};
        int returnNum = removeElement(nums, 3);

        for (int i = 0; i < returnNum; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
    public static int removeElement(int[] nums, int val) {
        // int to keep track of position to write elements at with array
        int pos = 0;

        // for loop increments through the array
        for (int i = 0; i < nums.length; i++)
        {
            // if the current index is not the value to remove the array writes the value at index pos and increments pos
            if (nums[i] != val)
            {
                nums[pos] = nums[i];
                pos++;
            }
        }

        return pos;
    }
}