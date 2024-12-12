package Model;

public class Transactions {
    private int transactionsID;
    private Books book;
    private Users user;

    public Transactions() {

    }

    public Transactions(int transactionsID, Books book, Users user) {
        this.transactionsID = transactionsID;
        this.book = book;
        this.user = user;
    }
    public int getTransactionsID() {
        return transactionsID;
    }
    public void setTransactionsID(int transactionsID) {
        this.transactionsID = transactionsID;
    }
    public Books getBook() {
        return book;
    }
    public void setBook(Books book) {
        this.book = book;
    }
    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }
    
}
