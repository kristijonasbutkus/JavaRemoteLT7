package advanced.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new PriorityQueue<>();

        // .offer ideda elementa i eile
        pokemons.offer("Digimon");
        pokemons.offer("Pilimon");
        pokemons.offer("Kirimon");
        // .peek leidzia paziureti pati pirma elementa (prideta pati pirma)
        // queue (eile) FIRST IN FIRST OUT.
        System.out.println(pokemons.peek());
        pokemons.poll();
        System.out.println(pokemons.peek());

    }
}
