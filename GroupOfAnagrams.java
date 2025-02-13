import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagrams {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("ate", "tea", "ant", "tan", "eat", "java"));

        Map<Character, Integer> m = new HashMap<>();

        char[] arr = list.get(0).toCharArray();
        for(char c : arr){
            if(m.containsKey(c)){
                m.put(c, m.get(c) + 1);
            }else{
                m.put(c, 1);
            }
        }

        List<List<String>> output = new ArrayList<>();
        Map<Character, Integer> current = new HashMap<>();

        for(int j = 0; j < list.size() ; j++){
            List<String> Internal = new ArrayList<>();
            for(int i = 1 ; i < list.size(); i++){

                if(!list.get(i).isEmpty()){
                    char[] arrr = list.get(i).toCharArray();
                    for(char c : arrr){
                        if(current.containsKey(c)) {
                            current.compute(c, (k,v) -> v == null ? 1 : v+1);
                        }else{
                            current.put(c,1);
                        }
                    }

                    if(current.keySet().equals(m.keySet()) && (m.values().equals(current.values()))){
                        list.set(i, "");
                        Internal.add(list.get(i));
                    }
                }

            }
            output.add(Internal);

        }

    }
}
