public class Main {
    public static void main(String[] args) {
       // double[] list1 = new double[5];
       // double[] list2 = new double[10];
       //double[] list1;
       //list1 = new double[20];
       /* String[] days = {"Pazartesi","Salı", "Çarşamba", "Perşembe", "Cuma"};
        String[] weekendDays = new String[]{"Cumartesi","Pazar"};
        System.out.println(weekendDays[0]);
        System.out.println(days.length); //array'in uzunluğunu (boyutunu) verir.
        days[0] = "Perşembe"; //0. index in değerini değiştirdik
        for(int i=0; i<= (days.length-1); i++) {
            System.out.println(days[i]);
        } */

        int cars[], count=3;
        cars = new int[count];
        for(int i=0; i<cars.length; i++)
            cars[i] = (i+1)*2;
        for(int j=0; j<cars.length; j++)
            System.out.print(cars[j] + ",");
    }
}