public class Main {
    public static void main(String[] args) {
       /* String[] flowers= {"Gül", "Papatya", "Kasım Patı"};
        for (String str: flowers ) {
            System.out.println(str);

        }*/
        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        for(int i = 0; i < matris.length; i++)  {
            for (int k = 0; k < matris[i].length; k++){
               // System.out.print(matris[i][k] + " ");
            }
            //System.out.println();
        }

        //for each ile aşağıdaki gibi kullanırız.
        for(int[] row : matris) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();

        }




       /* int[] list = {1, 2, 3, 4};
        //normalde dizilerin elemanlarını tek tek gezebilmek adına aşağıdaki gibi
        // for yapısını kullanıyorduk.
        for(int i=0;  i< list.length ; i++) {
            System.out.println(list[i]);
        }

            //Yukarıdaki işlemi daha da kısaltabilmek adına
            // java 8 ile beraber java dünyasında for each kavramı oluşturuldu.
            // For each genelde dizilerdeki ve listelerdeki elemanlara
            //daha hızlı erişebilmek için kullanılan kısa bir yöntemdir.
            //for döngüsünün modifiye edilmiş halidir.
            //for (veritipi değişken : diziAdı)  {
        //kodbloğu
            // }
            //şeklinde oluşturulur.
            *//*
            Burada iki parametreyi iki nokta ile ayırıyoruz
            ilk parametre dizinin döneceği veritipini ve for içinde dizinin elemanı olarak kullanacağınız değişkeni t
            ifade eder.
            Diğer kısımda ise dizimizin ismini belirtiriz.
             *//*

        int sum =0;
        for(int i : list) {
            sum += i;
        }
        System.out.println("Toplam: " + sum);*/
    }
}