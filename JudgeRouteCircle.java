/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mohammad
 */
public class JudgeRouteCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "LUDR";
        boolean result = JudgeCircle(s1);
        System.out.println(result);
    }
    
    public static boolean JudgeCircle(String moves){
        int x = 0;
        int y = 0;
        char[] ch = moves.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'L'){
                x--;
            } else if(ch[i] == 'R'){
                x++;
            } else if(ch[i] == 'D'){
                y--;
            } else if(ch[i] == 'U'){
                y++;
            }
        }
        return x == 0 && y == 0;
    }
    
}
