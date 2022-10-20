package s12.practice.practice1;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
//        Map<String,Integer> hashMap = new HashMap<>();
//        hashMap.put("Nuong",18);
//        hashMap.put("Nga",18);
//        hashMap.put("Lan",18);
//        hashMap.put("Diem",20);
//        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap +"\n");
        Map<String , Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Vinh",18);
        linkedHashMap.put("Thang",100);
        linkedHashMap.put("Tuan",22);
        linkedHashMap.put("Minh",21);

        System.out.println("\nThe age for "+"Thang is "+ linkedHashMap.get("Thang"));

    }
}
