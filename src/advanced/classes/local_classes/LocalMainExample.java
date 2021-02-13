package advanced.classes.local_classes;

public class LocalMainExample {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
                            //lokali klase for ciklo viduje
            class Pair {
                String key;
                int value;

                public Pair (String key, int value) {
                    this.key = key;
                    this.value = value;
                }
                public void print() {
                        System.out.println(value);
                    }

            }

            Pair pair = new Pair("key", i);
            pair.print();

        }

        // Uz ciklo klase nebepasiekiama.

      //  Pair pair = new Pair("key", i);


    }
}
