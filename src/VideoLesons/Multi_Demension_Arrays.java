package VideoLesons;

// https://youtu.be/17FwEtVsIMQ?list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak

public class Multi_Demension_Arrays {
    public static void main(String[] args) {
        //int[] my_arr = {1, 2, 3};
        int[][] matrice = {{11, 22}, {33, 44}};
        /* System.out.println(matrice[2][2]);
        System.out.println();

        String[][] x = new String[5][7];
        x[0][0] = "dfdsfdd";
        System.out.println(x[0][0]); */

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
