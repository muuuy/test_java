public class HealthStation {
    private int nums;

    public HealthStation() {
        this.nums = 0;
    }

    public int weigh(Person person) {
        this.nums += 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.nums;
    }
}