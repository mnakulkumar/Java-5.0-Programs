import java.util.*;

public class TestMap{
    public static void main(String[] args){
        HashMap<String, Integer> scores =new HashMap<String, Integer>();

        scores.put("Katherine",42);
        scores.put("Bairstow",343);
        scores.put("Ian",420);

        System.out.println(scores);
        System.out.println(scores.get("Bairstow"));

    }
}