/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText){
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "0";
        courseText = bookCourseText;
    }
    
    public String getAuthor() { 
        return author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public int getBorrowed() { 
        return borrowed;
    }
    
    public String getRefNumber() { 
        return refNumber;  
    }
    
    public void setRefNumber() { 
        if(refNumber.length()>= 3) {
            this.refNumber = refNumber;    
        }
        else { 
            System.out.println("Incorrect Reference Number");
        }
    }

    public void printAuthor() { 
        System.out.println(getAuthor());
    }
    
    public void printTitle() {
        System.out.println(getTitle());
    }
    
    public void borrow() { 
        borrowed = borrowed + 1;
    }
    
    public boolean isCourseText() {
        return courseText;
    }
    
    public void printDetails() { 
        System.out.println("Book Details");
        System.out.println("\n");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Number of Pages: " + getPages()); 
        
    if (getRefNumber().length()>0) { 
        System.out.println("Reference Number: " +getRefNumber());
    }
    else{
        System.out.println("Reference Number: ZZZ");
    }

        System.out.println("Borrowed: " + borrowed);       
    }
}
