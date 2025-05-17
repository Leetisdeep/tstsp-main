
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр","Пушкин");
        Author author2 = new Author("Лев","Толстой");

        Book book1 = new Book("Книга номер 1",author1,1994);
        Book book2 = new Book("Книга номер 2",author2,2025);

        System.out.println(book1.getPublicationYear());
        System.out.println(book2.getPublicationYear());

        System.out.println();
        book1.setPublicationYear(2004);
        
        System.out.println(book1.getPublicationYear());
        System.out.println(book2.getPublicationYear());

    }
}