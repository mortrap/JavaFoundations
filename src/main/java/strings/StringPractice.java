package strings;

public class StringPractice {
    public static void main(String[] args) {
        String s = "кабаки";
        System.out.println("palindromeMethod(s) = " + palindromeMethod(s));
    }

    public static String reverseString(String input) {
        char[] chArray = input.toCharArray();
        int start = 0;
        int end = chArray.length - 1;
        char temp;
        while (end > start) {
            temp = chArray[start];
            chArray[start] = chArray[end];
            chArray[end] = temp;
            end--;
            start++;
        }
        return new String(chArray);
    }

    public static boolean palindromeMethod(String s) {
        String str = s;
        if (reverseString(str).equalsIgnoreCase(s)) {
            return true;
        }
        return false;
    }
}
