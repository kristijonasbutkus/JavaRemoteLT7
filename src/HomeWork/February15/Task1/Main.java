package HomeWork.February15.Task1;

public class Main {
    public static void main(String[] args) {

        String a = "Add Astra Per Aspera";
        String c = "Ad";
        String lowerCase = a.toLowerCase();
        String upperCase = a.toUpperCase();

        String b = a.replaceAll("A", "X");
        System.out.println(a);

        if (a.matches("^Ad.*")) {
            System.out.println("Stringas prasideda raidemis Ad.");
        }
    }
}
