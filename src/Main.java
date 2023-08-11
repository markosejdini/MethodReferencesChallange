import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {

        String [] names =  {"Anna","john", "bob","donald"};

        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String:: toUpperCase
        ));
        applyChanges(names,list);

    }

    private static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunctions){
        List<String> backedByArray = Arrays.asList(names);
        for(var function: stringFunctions) {
            backedByArray.replaceAll(s->s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }
}
