public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        // делегируем вызов toString автора
        String authorStr = (author != null) ? author.toString() : "null";
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + authorStr +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; 
        if (obj == null || getClass() != obj.getClass())
            return false;

        Book other = (Book) obj;

        if (publicationYear != other.publicationYear)
            return false;

        if (title != null ? !title.equals(other.title) : other.title != null)
            return false;

        if (author != null ? !author.equals(other.author) : other.author != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 17; // стартовое число
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + publicationYear;
        return result;
    }
}