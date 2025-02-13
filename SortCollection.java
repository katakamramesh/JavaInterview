import java.util.*;

public class SortCollection {
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>(List.of(":", "ajsdgy", "uytiogasd", "gyasdig"));
        ll.add(1,"utfasd");
        Collections.sort(ll);
        System.out.println(ll);
    }


}
