public class Main {

    static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna" +
            "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint" +
            "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        String word = "Lorem";

        WordsChecker wordsChecker = new WordsChecker(text);

        System.out.println("Есть ли в тексте слово " + word + " - " + (wordsChecker.hasWord(word) ? "Yes" : "No"));
        word = "Alex";
        System.out.println("Есть ли в тексте слово " + word + " - " + (wordsChecker.hasWord(word) ? "Yes" : "No"));
    }
}