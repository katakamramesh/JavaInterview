import java.util.Arrays;
import java.util.List;

public class SentencesAndQueries {
    public static void main(String[] args) {

        List<String> sentences = List.of("Hi Nothing Hello Bad", "Hello Bad Bye", "Good Bad Hi");
        List<String> queries = List.of("Hi Hello", "Bad");
        int[][] pr = returnTheValue(sentences, queries);
        System.out.println(Arrays.stream(pr).toList() + " ----- pr" );
    }

    private static int[][] returnTheValue(List<String> sentences, List<String> queries) {
        int[][] output = new int[sentences.size()][queries.size()];
        for(int i = 0; i < sentences.size(); i++){
            //String[] arr = sentences.get(i).split(" ");
            //System.out.println("sentences" + Arrays.stream(arr).toList());
            for (int j = 0; j < queries.size(); j++){
                String[] arr1 = queries.get(j).split(" ");
                for(String a : arr1){
                    if(sentences.get(i).contains(a))
                        output[i][j] = i;
                }
                System.out.println( " ---- " + Arrays.deepToString(output));
                System.out.println("queries" + Arrays.stream(arr1).toList());
            }
        }
        return output;
    }

}
