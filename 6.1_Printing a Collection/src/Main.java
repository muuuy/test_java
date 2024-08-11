public class Main {
    public static void main(String[] args) {
        SimpleCollection s1 = new SimpleCollection("alphabet");
        System.out.println(s1);

        System.out.println();

        s1.add("a");
        System.out.println(s1);

        System.out.println();

        s1.add("b");
        System.out.println(s1);

        System.out.println();

        s1.add("c");
        System.out.println(s1);

        SimpleCollection s = new SimpleCollection("characters");
        System.out.println(s);

        System.out.println();

        s.add("magneto");
        System.out.println(s);

        System.out.println();

        s.add("mystique");
        System.out.println(s);

        System.out.println();

        s.add("phoenix");
        System.out.println(s);
    }
}