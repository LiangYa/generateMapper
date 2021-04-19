package com.code.rule;

import java.util.HashMap;
import java.util.Map;

/**
 * 建议map遍历的时候通过entrySet而不是KeySet
 *
 * 若使用keySet()遍历，同时在循环体内还需要获取value，
 * 则需要在每次遍历到key的时候再去执行一次get()方法，
 * 此时不如使用entrySet()，可以一步到位一次遍历出整个key-value。
 *
 * @author liangya
 * @date 2021/4/19 14:26
 */
public class MapCode {
    public static void main(String[] args) {
        Map<Integer, String> res = new HashMap<>();
        res.put(1,"1");
        res.put(2,"2");
        for (Map.Entry<Integer, String> entry : res.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        for (Integer key:res.keySet()
             ) {
            System.out.println(key + ":" + res.get(key));
        }
    }
}
