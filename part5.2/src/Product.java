public class Product {
    private String name;
    private String section;
    private int weight;

    public Product(String name, String section, int weight) {
        this.name = name;
        this.section = section;
        this.weight = weight;
    }

    public Product(String name) {
        this(name, "shelf", 1);
    }

    public Product(String name, String section) {
        this(name, section, 1);
    }

    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.section;
    }
}
