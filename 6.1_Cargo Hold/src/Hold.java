import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int weight = 0;
        for(Suitcase currSuitcase : this.suitcases) {
            weight += currSuitcase.totalWeight();
        }

        return weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = this.totalWeight();

        if((weight + suitcase.totalWeight()) > this.maxWeight) { return; }

        this.suitcases.add(suitcase);
    }

    public void printItems() {
        for(Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        int num = this.suitcases.size();
        int weight = this.totalWeight();

        return num + " suitcases (" + weight + " kg)";
    }
}
