package HomeWork.February15.Task6;

public class Main {

    public static void main(String[] args) {

        House[] houses = new House[3];
        //arba
        houses[0] = new House(140, "District 11", 1911, "fitted");
        houses[1] = new House(80, "District 11", 1855, "not finished");
        houses[2] = new House(115, "District 11", 1902, "finished");

        for (int i = 0; i < houses.length; i++) {
            System.out.println(houses[i]);

        }

    }
}
