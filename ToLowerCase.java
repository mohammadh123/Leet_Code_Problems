
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad
 */
public class ToLowerCase {
    public static void main(String[] args) {
        String word = "HeLlO WoRlD";
        System.out.println(toLowerCase(word));
    }
    public static String toLowerCase(String str){
        char[] c = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(c[i] >= 'A' && c[i] <= 'Z'){
                c[i] += 'a'-'A';
            }
        }
        //converts array of characters back to string
        return new String(c);
    }
}
