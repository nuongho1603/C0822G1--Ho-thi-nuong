package nga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        System.out.println(solve("aabcc","adcaa"));
    }
    public static int solve(String s1,String s2){
        int count = 0;
        String[] stringList1 = s1.split("");
        List<String> s1List = new ArrayList<>();
        s1List.addAll(Arrays.asList(stringList1));
        String[] stringList2 = s2.split("");
        List<String> s2List = new ArrayList<>();
        s2List.addAll(Arrays.asList(stringList2));
        for (int i = 0; i < s1List.size(); i++) {
            for (int j = 0; j <s2List.size() ; j++) {
                if (s1List.get(i).equals(s2List.get(j))){
                    count++;
//                    s1List.remove(i);
                    s2List.remove(j);
                    break;
                }
            }
        }
        return count;
    }
}
