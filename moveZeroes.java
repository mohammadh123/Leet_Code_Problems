
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
public class moveZeroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,0,3,9,0,0,12};
        int[] result = moveZeroes(array);
        
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] moveZeroes(int[] array){
        if(array.length == 0){
            return null;
        } else {
            for(int i = 0; i < array.length; i++){
                for(int j = i; j < array.length; j++){
                    if(array[i] == 0){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }
    
}
