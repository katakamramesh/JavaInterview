import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetitiveChar {

    public static void main(String[] args) {
        String s = "asdknboasdndkb";

        char[] arr = s.toCharArray();
        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
        for(char cc : arr){
            int temp;
            if(null != linkedHashMap.get(cc)){
                temp = linkedHashMap.get(cc);
                linkedHashMap.put(cc,temp+1);
            }else{
                linkedHashMap.put(cc, 1);
            }
        }

        for(Map.Entry<Character, Integer> m :linkedHashMap.entrySet()){
            if(m.getValue()==1){
                System.out.println(m.getKey() + "-----");
                return;
            }
        }
    }

}
