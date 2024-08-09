public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());

        System.out.println("\n");

        Stack s2 = new Stack();
        System.out.println(s2.isEmpty());
        System.out.println(s2.values());
        s2.add("Value");
        System.out.println(s2.isEmpty());
        System.out.println(s2.values());
        String taken = s2.take();
        System.out.println(s2.isEmpty());
        System.out.println(s2.values());
        System.out.println(taken);

        System.out.println("\n");

        Stack s3 = new Stack();
        s3.add("1");
        s3.add("2");
        s3.add("3");
        s3.add("4");
        s3.add("5");

        while (!s3.isEmpty()) {
            System.out.println(s3.take());
        }
    }
}