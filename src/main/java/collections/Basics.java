package collections;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};
        tab[3]= 7;
        //Trier le tableau par ordre
        Arrays.sort(tab);
        //Récupérer la position du chiffre key
        int position = Arrays.binarySearch(tab, 7);
        System.out.println("Position: " + position);

        for(int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }

        int[][] matrix = new int [3][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        matrix[2][0] = 5;
        matrix[2][1] = 6;
        System.out.println(matrix[1][0]);
    }
}
