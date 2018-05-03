import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookManager {
    private List<Book> bookList;
    
    public BookManager() {
        bookList = new BookCatalog().getCatalog();
    }
   
    //add predicate method p709 List<Book> books, 
    public List<Book> getBooks ( Predicate <Book> condition ){
    	List<Book> getBooks = new ArrayList<> ();
    	for (Book b: bookList) {
    		if (condition.test(b)) {
    			getBooks.add(b);
    		}
    	}
    	 return getBooks;
    }
   

    public List<Book> getBooksByTitle(String title) {
        List<Book> books = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getTitle().equals(title)) {
                books.add(b);
            }
        }
        return books;
    }
    
    public List<Book> getBooksByCategory(String category) {
        List<Book> books = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getCategory().equals(category)) {
                books.add(b);
            }
        }
        return books;
    }
    
    public List<Book> getBooksByFormat(String format) {
        List<Book> books = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getFormat().equals(format)) {
                books.add(b);
            }
        }
        return books;
    }
}