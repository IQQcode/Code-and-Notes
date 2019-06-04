package Class.ReviewExam.Section12;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[] {34,67,90,43,124,87,65,99,132,26};
        for(int i = 0;i < 10; i++) {
            for(int j = 0; j < 9 - i;j++) {
                if(arr[j] > arr[j+1]) {
                   int temp = arr [j];
                   arr [j] = arr [j+1];
                   arr [j+1] = temp;
                }
            }
        }
        for(int i =0 ; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
