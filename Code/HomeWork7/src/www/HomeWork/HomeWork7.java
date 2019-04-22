package www.HomeWork;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        double[][] array = readSolution();
        System.out.println("您输入的矩阵为： ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("您输入的矩阵对角线元素的和为： " + addDiagonalSum(array));
    }

    public static double[][] readSolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个n * n 的矩阵 ：");
        double[][] array = new double[4][4];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }

    public static double addDiagonalSum(double[][] array) {
        double sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(i == j ) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
