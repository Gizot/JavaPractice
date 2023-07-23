public class Main {
    public static void main(String[] args) {

        int[] list = new int[5];
        int[] list2 = {1,2,3,4,5};

        int[][] matris = {
                {0,453,939,243,283,295},
                {453, 0, 490, 384, 620, 439},
                {939,490,0,839,863,423},
                {243,384,839,0,544,823},
                {783, 620, 863, 544,0,1045},
                {891, 439, 423, 823,1045,0}
        };
        System.out.println(matris[5][4]);
        //int[][] matris = new int[6][6];                 //ilk köşeli parantez satırı -
        // ikinci köşeli parantez sütunu oluşturur.
        //new int dedikten sonra yine boyutu belirtmek zorundayız
        //biz 6'ya 6'lık bir matris oluşturduk.
        //peki nasıl ulaşacağız istediğimiz elemana? , tekboyutla mantık aynı
        //Unutmaman gereken tek şey ilk parantez satır ikinci parantez sütun
       // matris [0][0] = 0; // matrisin 1.satırın ve 1. sütunundaki elemanı "0"
        //olarak tanımlamış olduk.
       // matris[2][3] = 839;
        //System.out.println(matris [2][3]);


    }
}