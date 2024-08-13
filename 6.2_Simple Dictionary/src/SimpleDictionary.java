import java.util.HashMap;

public class SimpleDictionary {
    private HashMap<String, String> dictionary;

    public SimpleDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String id, String word) {
        this.dictionary.put(id, word);
    }

    public String translate(String id) {
        return this.dictionary.get(id);
    }
}
