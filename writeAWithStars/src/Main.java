import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[][] list = new String[6][4];
        //i satır j sütun göstersin
        //i nin 0 ve 2  olduğu heryerde yıldızlar olacak
        //j'nin de 0 ve 3 olduğu heryerde yıldızlar olacak
        //Böylelikle a deseni çıkmış oldu bunu koda dökeceğiz.
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (i == 0 || i == 2) {
                    list[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    list[i][j] = " * ";
                } else {
                    list[i][j] = "   ";
                }
            }
        }
        for (String[] row : list) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();

        }
    }
}