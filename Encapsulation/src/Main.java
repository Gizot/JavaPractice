public class Main {
    public static void main(String[] args) {
        Book lordOfTheRings = new Book("Lord Of The Rings", 1000);
        Book harryPotter = new Book("Harry Potter" , -100);

        System.out.println(lordOfTheRings.showName() + lordOfTheRings.changeNumber());
        System.out.println(harryPotter.showName() + harryPotter.changeNumber());
    }
}