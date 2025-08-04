import javax.lang.model.element.NestingKind;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Set.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        String input = "He is a very very good boy, isn't he?";
        //explain
        String[] words = input.split("[^a-zA-z]");
        System.out.println(Arrays.toString(words));

    }
}