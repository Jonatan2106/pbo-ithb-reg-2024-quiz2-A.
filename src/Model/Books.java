package Model;

public class Books {
    private int booksID;
    private String title;
    private String author;
    private String genre;
    private String price;

    @Override
    public String toString(){
        return booksID + title + author + genre + price;
    }

    public Books() {

    }
    
    public Books(int booksID, String title, String author, String genre, String price) {
        this.booksID = booksID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }
    public int getBooksID() {
        return booksID;
    }
    public void setBooksID(int booksID) {
        this.booksID = booksID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }


}
