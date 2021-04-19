
import com.code.rule.TypeEnum;

import java.util.*;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println(TypeEnum.TEST.getCode()+","+TypeEnum.TEST.getMsg());
        System.out.println(TypeEnum.TEST2.getCode()+","+TypeEnum.TEST2.getMsg());
        System.out.println("测试分支");
    }

//    public static void main(String[] args) {
//        BigDecimal decimal = new BigDecimal("0.10");
//        BigDecimal decimal1 = BigDecimal.valueOf(0.1);
//        BigDecimal decimal2 = new BigDecimal("0.1");
//        System.out.println(decimal.equals(decimal1));
//        System.out.println(decimal.equals(decimal2));
//
//        System.out.println(decimal.compareTo(decimal1));
//        System.out.println(decimal.compareTo(decimal2));
//    }

//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        int n = cin.nextInt();
//        int distint = cin.nextInt();
//        if (n > 100000 || n < 0 || distint > 1000 || distint < 0) return;
//        int xnum = 0;
//        int inum = 0;
//        int first = cin.nextInt();
//        for (int i = 0; i < n-1; i++){
//            int next = cin.nextInt();
//            if ((first - distint) == next || (first + distint) == next) {
//                inum++;
//            } else {
//                if (xnum == 0 || xnum < inum){
//                    xnum = inum;
//                }
//            }
//        }
//
//        System.out.println(n -xnum);
//    }
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        int size = cin.nextInt();
//        //排序
//        TreeMap<Integer, Integer> ready = new TreeMap<>();
//        for (int i = 0; i < size; i++){
//            int readyTime = cin.nextInt();
//            int runTime = cin.nextInt();
//            ready.put(readyTime,runTime);
//        }
//        int minTime = 0;
//        if (!ready.isEmpty()) {
//            Map.Entry<Integer, Integer> integerIntegerEntry = ready.pollFirstEntry();
//            minTime = integerIntegerEntry.getKey() + integerIntegerEntry.getValue();
//            while (!ready.isEmpty()) {
//                Map.Entry<Integer, Integer> minMap = ready.floorEntry(minTime);
//                if (minMap.getKey() != null){
//                    minTime += minMap.getValue();
//                    ready.remove(minMap.getKey());
//                } else {
//                    Map.Entry<Integer, Integer> maxMap = ready.pollFirstEntry();
//                    minTime = maxMap.getKey() + maxMap.getValue();
//                }
//            }
//        }
//
//        System.out.println(minTime);
//    }

}
