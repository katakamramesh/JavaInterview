import java.util.Arrays;
import java.util.stream.Stream;

public class FirstSingleCountCharacterInString {
    public static void main(String[] args) {
        String temp = "sharingggeenr";
        char[] arr = temp.toCharArray();

        Stream.of(arr).forEach((k) -> System.out.println("args = " + Arrays.toString(args)));

    }
}
