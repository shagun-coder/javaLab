class Sentence {
    String sentence;

    Sentence(String s) {
        sentence = s;
    }

    int count() {
        int count = 0;
        String[] words = sentence.split(" ");
        count = words.length;
        return count;

    }

    void display() {
        int count1 = count();
        System.out.println("The count of number of words in sentence: " + count1);
    }

    public static void main(String[] args) {
        Sentence s1 = new Sentence("my name is Bhoomija Sharma");
        s1.display();
    }
}
