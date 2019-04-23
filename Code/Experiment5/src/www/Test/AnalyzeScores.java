package www.Test;

public class AnalyzeScores {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        int sum = 0;       int average = 0;
        int highAverage = 0;   int lowAverage = 0;
        System.out.print("The Scores is:  " );
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
            average = sum / arr.length;
            if(arr[i] > average) {
                highAverage++;
            }else {
                lowAverage++;
            }
        }
        System.out.println("\nThe student average Scores is " + average);
        System.out.println("\nThe Hign Scores number is " + highAverage);
        System.out.println("\nThe Low Scores number is " + lowAverage);

    }

}
