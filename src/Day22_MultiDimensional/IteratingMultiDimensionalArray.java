package Day22_MultiDimensional;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        //index of the elements  012     0123      012345
                int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
                // index of arrays 0        1          2
        for (int i =0;i< arr2D.length;i++){
            for (int j=0;j< arr2D.length;j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }






















    }
}
