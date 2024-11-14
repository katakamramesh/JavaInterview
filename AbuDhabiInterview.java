import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class AbuDhabiInterview {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        Set<String> ss = new HashSet<>();
        for(String s : names1){
            ss.add(s);
        }
        for(String s : names2){
            ss.add(s);
        }
        String[] s = ss.toArray(new String[ss.size()]);
        return s;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", AbuDhabiInterview.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia

        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));

        String msg = "Hey! How are you?\nI am good, how about you?\nI am good too.";

        try(InputStream stream = new ByteArrayInputStream(msg.getBytes())) {
            System.out.println(AbuDhabiInterview.getOccurrenceCount("good", stream));
        }catch (Exception ee){

        }
    }

    public static int findMaxSum(List<Integer> list) {
        int largest = Integer.MIN_VALUE;
        int seconLargest = Integer.MIN_VALUE;

        for(int i : list){
            if(i > largest){
                seconLargest = largest;
                largest = i;
            }else if(i > seconLargest){
                seconLargest = i;
            }
        }
        return largest+seconLargest;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        /*Collections.sort(list);
        int length = list.size();

        return list.get(length-1) + list.get(length-2);*/
    }

    public static int getOccurrenceCount(String toSearch, InputStream stream) throws Exception {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        int count = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line  ;
        try{
            while((line = reader.readLine()) != null){
                if(line.contains(toSearch)){
                    count++;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return count;
    }

}
