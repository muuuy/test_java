import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int cost = 0;
        for(Item listItem : this.items) {
            cost += listItem.getWeight();
        }

        if((cost + item.getWeight()) > this.maxWeight) {
            return;
        }

        this.items.add(item);
    }

    public void printItems() {
        for(Item item : this.items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)" );
        }
    }

    public int totalWeight() {
        int weight = 0;

        for(Item item : this.items) {
            weight += item.getWeight();
        }

        return weight;
    }

    public Item heaviestItem() {
        if(this.items.isEmpty()) { return null; }

        Item heaviest = null;

        for(Item item : this.items) {
            if(heaviest == null || item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    public String toString() {
        int amount = this.items.size();

        int weight = this.totalWeight();

        if(amount == 0) { return "no items (0 kg)"; }
        else if(amount == 1) { return amount + " item (" + weight + " kg)"; }

        return amount + " items (" + weight + " kg)";
    }
}
