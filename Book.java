import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;

    public Book(String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.isIssued=false; // By default, thhe book is not issued.
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public boolean isIssued(){
        return isIssued;
    }
    public void setIssued(boolean issued){
        isIssued=issued;
    }

    @Override
    public String toString(){
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\nIssued: " + (isIssued ? "Issued":"Available");
    }
}