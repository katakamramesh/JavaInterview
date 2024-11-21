import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class GenerateStringFetch2ndLongest {
    public static void main(String[] args) {
        //randomString
        //2nd longest string based on length

        Random r = new Random();
        String value = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int x = 0;
        String arr[] = new String[5];
        while(x < 5) {
            StringBuilder sb = new StringBuilder();
            while (sb.length() < x) {
                int temp = (int) (r.nextFloat() * 10);
                sb = sb.append(value.charAt(temp));
            }
            arr[x] = sb.toString();
            x++;
        }
        System.out.println("---------"+Arrays.toString(arr));

        System.out.println(Arrays.stream(arr).distinct()
                .sorted(Comparator.comparingInt(String :: length).reversed())
                .skip(1).findFirst().orElse(null));
        //System.out.println(Arrays.stream(arr).distinct().sorted().skip(arr.length-1).findFirst().stream().toList().get(0).length());

        int longest = 0;
        String var = "";
        String secondVar = "";
        for(String p : arr){
            if(longest < p.length()){
                secondVar = var;
                var = p;
                longest = p.length();
            }
        }

        System.out.println("secondLongest --> " + secondVar);
    }
}
