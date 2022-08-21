public class Main {

    public static void main(String[] args) {

        MagicBox<String> testString = new MagicBox<>(5);
        String boxString[] = {"Python", "Java", "JS", "Haskell", "C++"};
        testString.add(boxString[0]);
        testString.add(boxString[1]);
        testString.add(boxString[2]);
        testString.add(boxString[3]);
        testString.add(boxString[4]);
        testString.pick();

        MagicBox<Integer> testInteger = new MagicBox<>(5);
        int boxInteger[] = {404, 502, 666, 90, 777};
        testInteger.add(boxInteger[0]);
        testInteger.add(boxInteger[1]);
        testInteger.add(boxInteger[2]);
        testInteger.add(boxInteger[3]);
        testInteger.add(boxInteger[4]);
        testInteger.pick();
    }
}
