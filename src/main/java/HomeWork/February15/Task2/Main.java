package HomeWork.February15.Task2;

public class Main {

    public static void main(String[] args) {

        Dog[] dogsArray = new Dog[3];


        dogsArray[0] = new Dog("Ciobrelis", 5, "Black");
        dogsArray[1] = new Dog("Skipis", 2, "Brownish");
        dogsArray[2] = new Dog("Lota", 8, "White");

        OldestDog(dogsArray);

    }
        public static void OldestDog (Dog[] dogsArray){

            int oldest = 0;
            int arrayIndex = 0;
            for (int i = 0; i < dogsArray.length; i++) {
                if (dogsArray[i].age > oldest) {
                    oldest = dogsArray[i].age;
                    arrayIndex = i;
                }
            }
            System.out.println("Vyriausias sunelis yra " + dogsArray[arrayIndex].name +
                    ". Jo amzius: " + oldest);

        }

}

