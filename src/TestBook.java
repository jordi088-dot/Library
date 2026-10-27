public class TestBook {
    public static void main(String[] args) {
        Book cars = new Book("Cars", new Author("Walt Disney", "waltdisney@email.com", 'm'), 19.95, 10000);

        System.out.println(cars);
    }
}
