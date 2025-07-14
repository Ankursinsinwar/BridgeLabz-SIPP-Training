// Linear Search - Find Specific Word in Sentences
package String_IO_Search_Problems_Java.LinearSearch;
public class FindWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is fun.",
            "I love programming.",
            "Data structures are cool."
        };
        String word = "programming";
        System.out.println("Found sentence: " + findSentenceWithWord(sentences, word));
    }
}