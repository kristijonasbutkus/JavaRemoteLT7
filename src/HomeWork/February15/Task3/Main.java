package HomeWork.February15.Task3;

public class Main {
    public static void main(String[] args) {

        Car[] carsArray = new Car[3];

        carsArray[0] = new Car("BMW", "ASDF1234", 2019, 89000, "Sedan");
        carsArray[1] = new Car("VW Golf", "ASDF4321", 2007, 6000, "Sedan");
        carsArray[2] = new Car("Opel Astra", "UPS811", 1999, 1999, "SUV");

        NewestCar(carsArray);

        System.out.println("Vidutine parduodamu automobiliu kaina yra " + MidPriceCar(carsArray) +
                " Eur.");

        FindTypeSedan(carsArray);

        System.out.println("Brangiausias turimas automibilis kainuoja " + MaxpensiveCar(carsArray) +
                " Eur.");
    }
// Naujausias automobilis
    public static void NewestCar (Car[] carsArray){
        int oldestCar = 0;
        int arrayIndex = 0;
        for (int i = 0; i < carsArray.length; i++) {
                if (carsArray[i].year > oldestCar) {
                    oldestCar = carsArray[i].year;
                    arrayIndex = i;
                }
        }
        System.out.println("Naujausias automobilis yra " + carsArray[arrayIndex].model +
                ". Pagaminimo metai: " + oldestCar);
    }

// Vidutine parduodamu automobiliu kaina
    public static double MidPriceCar (Car[] carsArray){
        double midPrice = 0;
        for (Car car : carsArray) {
            midPrice += car.price;
        }
        return midPrice / carsArray.length;
    }

// Rasti sedanus, spausdinti auto modelius
    public static void FindTypeSedan (Car[] carsArray){
        for (Car car : carsArray) {
            if (car.type.matches("Sedan")) {
                System.out.println("Sedanas: " + car.model);
            }
        }
    }

// Brangiausias automobilis
    public static double MaxpensiveCar (Car[] carsArray){
        double maxPrice = 0;
        for (Car car : carsArray) {
            if (car.price > maxPrice) {
                maxPrice = car.price;
            }
        }
        return maxPrice;
    }
}
