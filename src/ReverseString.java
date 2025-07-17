import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        /*
        //Using StringBuilder
        String str = "Sudipta Sarkar";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        */
        //Using Stream
        String str = "Sudipta Sarkar";
        String reverse = Stream.of(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reverse);
        //Using iterator
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
