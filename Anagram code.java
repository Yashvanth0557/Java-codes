import java.util.*;
public class Anagram {
    public static void main(String[] args) {

        String str = "Slinet";
        String str1 = "Listen";

        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();

        if (arr.length != arr1.length) {
            System.out.println("Not an Anagram.");
            return;
        }

        Arrays.sort(arr);
        Arrays.sort(arr1);

        if (Arrays.equals(arr, arr1)) {
            System.out.println("An Anagram.");
        } else {
            System.out.println("Not an Anagram.");
        }
    }
}
