package collection;

import java.util.Iterator;
import java.util.Map;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/7 18:19
 * @Version 1.0
 **/
public class MapFor {

    public void getAll_1(Map<String,String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key:"+entry.getKey()+";value:"+entry.getValue());
        }
    }
    public void getAll_2(Map<String,String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key:"+entry.getKey()+";value:"+entry.getValue());

        }
    }
    public void getAll_3(Map<String,String> map) {
        map.forEach((k,v) -> {
            System.out.println("key:"+k+";value:"+v);
        });
    }
    public void getAll_4(Map<String,String> map) {
       map.entrySet().stream().forEach(entry -> {
           System.out.println("key:"+entry.getKey()+";value:"+entry.getValue());
       });
    }

}
