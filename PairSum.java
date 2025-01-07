import java.util.HashSet;

public class PairSum {
    public static boolean hasPairWithSum(int[] arr, int targetSum) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        for (int number : arr) {
            int complement = targetSum - number;
            if (seenNumbers.contains(complement)) {
                return true;
            }
            seenNumbers.add(number);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int targetSum = 17;
        System.out.println(hasPairWithSum(arr, targetSum)); // Output: true
    }
}