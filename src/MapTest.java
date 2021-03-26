import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*计算一个字符串中每个字符出现次数。*/
public class MapTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = in.next();
        Map<Character, Integer> count = new HashMap<>();

        Set<Character> keys = count.keySet();
        for (int i = 0; i < str.length(); i++) {
            if (keys.contains(str.charAt(i))) {  //如果该字符存在于map集合中
                //则将集合中该字符对应的value+1
                Integer value = count.get(str.charAt(i)) + 1;
                count.put(str.charAt(i), value);
            }else {
                count.put(str.charAt(i), 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = count.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //DateTimeUtil.parseDate(eventTime, DateType.yyyy_MM_dd_HH_mm_ss));


    }
}
