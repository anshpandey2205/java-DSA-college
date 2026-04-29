package lect27;

public class backtrack {
    public static void backtrack(int[] arr, int idx, String ans) {
        if (idx == arr.length) {
            System.out.println(ans);
            return;
        }

        backtrack(arr, idx + 1, ans + arr[idx] + " ");
        backtrack(arr, idx + 1, ans);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        backtrack(arr, 0, "");
    }
}
