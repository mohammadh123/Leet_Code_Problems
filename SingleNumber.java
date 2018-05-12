/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author Mohammad
 */
public class SingleNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,1,2,2,4,4,3,5,5};
        int result = singleNumber(array);
        System.out.println(result);
    }
    public static int singleNumber(int[] arr){
        int result = 0;
        HashMap hmap = new HashMap();
        for(int n: arr){
            Integer counter = (Integer)hmap.get(n);
            if(counter != null){
                counter = counter + 1;
                hmap.put(n, counter);
            } else {
                counter = 1;
                hmap.put(n, counter);
            }
        }
        Iterator iterator = hmap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry me = (Map.Entry)iterator.next();
            if((int)me.getValue() < 2){
                result = (int)me.getKey();
            }
        }
        return result;
    }
    
}
