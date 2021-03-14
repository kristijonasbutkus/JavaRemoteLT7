package design_patterns.builder.toy;

public class ToyBuilderUsage {
    public static void main(String[] args) {
        final Toy toy = new ToyBuilder()
                .withMadeOf("plastic")
                .withName("Matchbox car")
                .withType("Small car")
                .build();
    }
}