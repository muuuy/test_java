import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> list;

    public SimpleCollection(String name) {
        this.list = new ArrayList<>();
        this.name = name;
    }

    public void add(String character) {
        list.add(character);
        return;
    }

    public String toString() {
        return String.join("\n", this.list);
    }
}
