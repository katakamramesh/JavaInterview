import java.util.Comparator;
import java.util.List;

public class ThirdHighest {

    public static void main(String[] args) {
        List<Integer> l = List.of(1,2,2,3,3,3,4,4,5);
        System.out.println(l.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst());
    }
}
