package Turkceders;

public class Array2 {
    public static void main(String[] args) {
        int[][] arr={{10,20,30},{40,50,60}};
        int[][] arr2=new int[2][3];
        arr2[0][0]=10;
        arr2[0][1]=10;
        arr2[0][2]=10;
        arr2[1][0]=10;
        arr2[1][1]=10;
        arr2[1][2]=10;

        System.out.println("0 a 0:"+arr[0][0]);
        System.out.println("2 nin 2 si:"+arr [1][2]);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Eleman:"+arr2[i][j]);

            }

        }


    }
}
