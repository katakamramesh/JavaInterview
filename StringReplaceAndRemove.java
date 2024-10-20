import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StringReplaceAndRemove {
    public static void main(String[] args) {
        List<String> l = List.of("qwe","sasd","phasgd");

        l.stream().map(x -> x.startsWith("q") ? "abc" : x);//replace abc which is starting with q

        l.stream().map(x -> x.startsWith("p") ?  null : x);//replace null which is starting with p

        l = l.stream().map(temp -> {///replace above both
            if(temp.startsWith("q")){
                return "abc";
            }else if(temp.startsWith("s")){
                return null;
            }else{
                return temp;
            }
        }).toList();

        System.out.println("args = " + l);
    }
}
