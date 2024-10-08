import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void add(String value) {
        this.stack.add(value);
        return;
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        return this.stack.removeLast();
    }
}
