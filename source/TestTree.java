import java.util.*;

public class TestTree{
    public static void main(String[] args){
        new TestTree().go();
    }

     public class BookCompare implements Comparator<Book>{
        public int compare(Book one,Book two){
            return (one.getTitle().compareTo(two.getTitle()));
        }
    }

    public void go(){        

        BookCompare bCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<Book>(bCompare);
        tree.add(new Book("How Cats Work"));
        tree.add(new Book("Remix your Body"));
        tree.add(new Book("Finding Emo"));
        tree.add(new Book("Harry Potter"));
        tree.add(new Book("Beauty And The Beast"));
        tree.add(new Book("Pride And Prejudice"));
        
        System.out.println(tree);
    
    }
}

class Book  implements Comparable<Book> {
    private String title;

    public int compareTo(Book b){
        
        return title.compareTo(b.getTitle());
    }

   

    public Book(String t) {
        title = t;
    }

    public String getTitle(){
        return title;

    }

    public String toString(){
        return getTitle();
    }

    
}