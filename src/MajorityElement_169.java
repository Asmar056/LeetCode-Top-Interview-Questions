import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement_169 {
    public static int majorityElement(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = majorityElement(arr);
        System.out.println(result);

    }
}
