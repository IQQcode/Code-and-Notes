package Class.ReviewExam.Section8;

public class Section8_3 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        };
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int demoArray[] = new int[10];
        for (int i = 0; i < answers.length; i++) {
            int correntCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correntCount++;
            }
            demoArray[i] = correntCount;
        }
        for (int i = 0; i < demoArray[i]; i++) {
            // 从后向前，排好序的放在数组前面
            for (int j = demoArray[i] - 2; j >= i; j--)
                // 冒泡排序
                if (demoArray[j] < demoArray[j + 1]) {
                    int temp = demoArray[j];
                    demoArray[j] = demoArray[j + 1];
                    demoArray[j + 1] = temp;
                }
        }
        for(int i : demoArray) {
            System.out.println("Student" + i + "'s corrent count is "
                    + demoArray[i]);
        }
    }
}
