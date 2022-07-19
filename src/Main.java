import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private final static List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9,
            6, 10, 15, 3, 5, 2, 7, 20, 43, 25));
    private static final String text = "Open the access panel 325 Remove electrical connector from oil pressure " +
            "transducer Remove oil pressure transducer Remove and discard o-ring Install new o-ring on the oil " +
            "pressure transducer Install oil pressure transducer Connect the electrical connector to the oil " +
            "pressure transducer Close access panel 325";

    public static void oddNumbers() {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + ", ");
            }
        }
        System.out.println();
    }

    public static void evenNumbers() {
        List<Integer> listOfEvenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0 && !listOfEvenNumbers.contains(number)) {
                listOfEvenNumbers.add(number);
            }
        }
        listOfEvenNumbers.sort(null);
        for (Integer listOfEvenNumber : listOfEvenNumbers) {
            System.out.print(listOfEvenNumber + ", ");
        }
        System.out.println();
    }

    public static void uniqueWords(){
        List<String> listOfUniqueWords = new ArrayList<>();
        for (int i = 0; i < text.split(" ").length; i++) {
          if(!listOfUniqueWords.contains(text.split(" ")[i])){
             listOfUniqueWords.add(text.split(" ")[i]);
           }else{
            listOfUniqueWords.remove(text.split(" ")[i]);
            }
        }
        for (String listOfUniqueWord : listOfUniqueWords) {
          System.out.print(listOfUniqueWord + " ");
      }
        System.out.println();
    }
    public static void repeatingCounter(){

    }

    public static void main(String[] args) {
        oddNumbers();
        evenNumbers();
        uniqueWords();
    }
}