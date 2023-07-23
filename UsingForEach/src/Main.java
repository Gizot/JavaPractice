public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
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
            /*
            Burada iki parametreyi iki nokta ile ayırıyoruz
            ilk parametre dizinin döneceği veritipini ve for içinde dizinin elemanı olarak kullanacağınız değişkeni t
            ifade eder.
            Diğer kısımda ise dizimizin ismini belirtiriz.
             */

        int sum =0;
        for(int i : list) {
            sum += i;
        }
        System.out.println("Toplam: " + sum);
    }
}