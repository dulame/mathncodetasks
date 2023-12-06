package tasks;

public class MainBook {
    public static void main(String[] args) {
        Book book1 = new Book("title1", "someauthor", 1000);
        Book book2 = new Book("title2", "someauthor", 1999);

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1);
        System.out.println(book2);
    }
}
