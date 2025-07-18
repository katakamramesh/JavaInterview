import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
public interface CustomFunctionalInterface {
    String method1(String a, String b, String c);
}

class Implementation {


    public static List<String> ll = List.of("sample1", "sample2", "sample3");

    public static void main(String s[]){
        ll.stream().reduce((a,b) -> {
            String combined = a+b;
            System.out.println(combined);
            return combined;
        });
    }

}

