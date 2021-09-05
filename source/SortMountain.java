import java.util.*;
import java.lang.Integer;
public class SortMountain{
    LinkedList<Mountain> mtn = new LinkedList<Mountain>();
    class NameCompare implements Comparator<Mountain>{
        public int compare(Mountain one,Mountain two){
            return one.getName().compareTo(two.getName());

        }
    }

    class HeightCompare implements Comparator<Mountain>{
        public int compare(Mountain one,Mountain two){
            return Integer.compare(one.getHeight(),two.getHeight()); //Height in ascending order
           
            //return two.getHeight()-one.getHeight(); // Height in descending order       

        }
    }

    public static void main(String [] args){
        new SortMountain().go();
    }

    public void go(){
        mtn.add(new Mountain("Longs",14255));
        mtn.add(new Mountain("Elbert",14433));
        mtn.add(new Mountain("Maroon",14156));
        mtn.add(new Mountain("Castle",14265));

        System.out.println("as entered:\n" +mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn,nc);
        System.out.println("by name:\n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn,hc);
        System.out.println("by height:\n"+ mtn);        

    }
}

class Mountain{
    private String name;
    private int height;

    public Mountain(String name,int height){
        this.name = name;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

    public String toString(){
        return name+" "+height;
    }
}