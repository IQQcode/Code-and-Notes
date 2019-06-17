package heap;

import java.util.Comparator;
import java.util.Random;

/**
 * @Author: yuisama
 * @Date: 2019-06-06 19:37
 * @Description:
 */

public class HeapTest {
    public static void main(String[] args) {
        int n = 100;
        Random random = new Random();
        Heap<Integer> heap = new Heap<>(n);
        for (int i = 0;i < n;i++) {
            heap.add(random.nextInt(1000));
        }
        int[] nums = new int[n];
        for (int i = heap.getSize() - 1;i >= 0;i--) {
            nums[i] = heap.extractMax();
        }
        for (int i : nums) {
            System.out.print(i+"、");
        }
    }
}
