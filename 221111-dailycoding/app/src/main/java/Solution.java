import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<String, Integer> dictionary = new HashMap<>();

        createDictionary(dictionary);

        int dictionaryNumber = 27;
        int counter = 0;
        int wordLength = msg.length();

        while (counter < wordLength) {
            if(counter == wordLength - 1) {
                arrayList.add(dictionary.get(String.valueOf(msg.charAt(counter))));
                break;
            }

            String word = String.valueOf(msg.charAt(counter));
            counter += 1;

            while (true) {
                if(counter >= wordLength) {
                    break;
                }

                String nextWord = String.valueOf(msg.charAt(counter));

                if(!dictionary.containsKey(word + nextWord)) {
                    dictionary.put(word + nextWord, dictionaryNumber);
                    dictionaryNumber += 1;
                    break;
                }

                word += nextWord;
                counter += 1;
            }

            arrayList.add(dictionary.get(word));
        }

        return arrayList.stream().mapToInt(number -> number).toArray();
    }

    private void createDictionary(HashMap<String, Integer> dictionary) {
        for (int i = 65; i <= 90; i += 1) {
            dictionary.put(String.valueOf((char) i), i - 64);
        }
    }
}
