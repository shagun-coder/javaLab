class Sentence {
    String sentence;

    // Correct constructor
    Sentence(String s) {
        sentence = s;
    }

    int count() {
        String[] words = sentence.split(" ");
        return words.length;
    }

    void display() {
        System.out.println("The count of number of words in sentence: " + count());
    }
}

public class SentenceD {
    public static void main(String[] args) {
        Sentence s1 = new Sentence("Hello World");
        s1.display();
    }
}