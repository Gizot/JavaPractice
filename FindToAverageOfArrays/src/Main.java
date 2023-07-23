public class Main {
    public static void main(String[] args) {
        int[] list = {10,10,10,10};
        double sum = 0.0;
        for(int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double average = sum / list.length;
        System.out.println("Average: " + average);

    }
}