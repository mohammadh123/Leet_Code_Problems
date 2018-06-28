/**
 *
 * @author Mohammad
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello";
        String result = reverseString(s);
        System.out.println(result);
    }
    
    public static String reverseString(String s){
        String reverseStr = "";
        for(int i =s.length()-1; i >= 0; i--){
            reverseStr = reverseStr + s.charAt(i);
        }
        return reverseStr;
    }
    
}
