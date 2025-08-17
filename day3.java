public class Main {
    public static int findDuplicate(int[] nums) {
        int low = 1, high = nums.length - 1;
        int duplicate = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Count how many numbers are <= mid
            int count = 0;
            for (int num : nums) {
                if (num <= mid) count++;
            }

            if (count > mid) {
                duplicate = mid;
                high = mid - 1;  // search left
            } else {
                low = mid + 1;   // search right
            }
        }

        return duplicate;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1,5 , 4, 1};
        System.out.println("Duplicate number: " + findDuplicate(arr));
    }
}
