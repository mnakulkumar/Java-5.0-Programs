import java.util.*;

public class TestTree{
    public static void main(String[] args){
        new TestTree().go();
    }

    public void go(){
        
        Book b1 = new Book("How Cats Work");        
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        Book b4 = new Book("Harry Potter");

        

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        tree.add(b4);
        
        System.out.println(tree);
    
    }
}

class Book implements Comparable<Book>{
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