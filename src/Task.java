import java.util.Arrays;

public class Task {
    static String output = "";
    public static void main(String[] args) {
        reverseString("hello madina amina jibek");
    }

    private static void reverseString(String input) {
        String str = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                reverse(str);
                output+=" ";
                System.out.println(str);
                str = "";
            } else if(i == input.length()-1){
                str += input.charAt(i);
                reverse(str);
            } else {
                str += input.charAt(i);
            }
        }
        System.out.println(output);
    }

    private static void reverse(String str){
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));
        for (int j = 0; j < charArray.length; j++) {
            charArray[j] = str.charAt((str.length()-1) - j);
        }
        for (int i = 0; i < charArray.length; i++) {
            output+=charArray[i];
        }
        System.out.println(output);
    }
}
