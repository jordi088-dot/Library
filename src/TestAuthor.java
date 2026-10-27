public class TestAuthor {
    public static void main(String[] args) {
        Author A = new Author("Nacho Vidal", "nachovidal@email.com", 'm');
        A.toString();
        System.out.println(A);
        A.setEmail("NachoVidalfarmaceutico@email.com");
        System.out.println(A);
    }
}
