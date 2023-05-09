package day4;

public class Multidimensional {
    public static void main(String[] args) {
        String arr[][][] = new String[2][2][1];
        arr[0][0][0] = "kitkat";
        arr[0][1][0] = "diary milk";
        arr[1][0][0] = "munch";
        arr[1][1][0] = "five star";

        for (int i = 0;i<arr.length; i++) {
            for (int j = 0;j<arr[0].length; j++) {
                for (int k = 0; k < arr[0][0].length; k++) {
                    System.out.println(arr[i][j][k]);
                }
            }

        }
    }





}
