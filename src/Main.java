import java.util.ArrayList;
import java.util.List;

public class Main {
    private final static List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9,
            6, 10, 15, 3, 5, 2, 7, 20, 43, 25));


    public static void oddNumbers() {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                System.out.print(numbers.get(i) + ", ");
            }
        }
    }

    public static void evenNumbers() {

    }


    public static void main(String[] args) {
        oddNumbers();
    }
}