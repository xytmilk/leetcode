import java.util.*;

public class Roman_to_Integer {
//	public int romanToInt(String s) {
//        int ans = 0;
//        Map<Integer, String> num = new HashMap();
//        num.put(new Integer(1), "I");
//        
//		return ans;
//    }
	
	
	public static void main(String[] args) {
         
         Map<Integer, String> num = new HashMap();
         num.put(new Integer(1), "I");
         num.put(new Integer(5), "V");
         num.put(new Integer(10), "X");
         num.put(new Integer(50), "L");
         num.put(new Integer(100), "C");
         num.put(new Integer(500), "D");
         num.put(new Integer(1000), "M");
 
         
         //取出所有的key,包裝為Set的型態
         Set set = num.keySet();
         
         Iterator it = set.iterator();
         while(it.hasNext()){
           Object myKey = it.next();
           System.out.println(myKey +"="+ num.get(myKey));
         }

	}

}
