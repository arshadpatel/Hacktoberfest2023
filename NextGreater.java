import java.util.ArrayDeque;
import java.util.Deque;

public class S06_NextGreater {
    public static void main(String[] args) {
        int arr[] = { 13, 15, 12, 14, 16, 8, 6, 4, 10, 30 };
        nextGreater(arr);
    }

    private static void nextGreater(int[] arr) {
        Deque<Integer> s = new ArrayDeque<>();
        s.push(arr.length - 1);
        System.out.print(-1 + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            while (s.isEmpty() == false && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            int res = s.isEmpty() ? -1 : arr[s.peek()];
            System.out.print(res + " ");
            s.push(i);
        }
    }
}
