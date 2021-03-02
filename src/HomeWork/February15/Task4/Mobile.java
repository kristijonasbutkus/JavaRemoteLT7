package HomeWork.February15.Task4;

public class Mobile {

    protected String model;
    protected String manufacturer;
    protected double price;

    public Mobile(String model, String manufacturer, double price){
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public static void MaxpensiveMobile (Mobile[] mobileArray){
        double temp = 0;
        int index = 0;

        for (int i = 0; i < mobileArray.length; i++) {
            if (mobileArray[i].price > temp) {
                temp = mobileArray[i].price;
                index = i;
            }
        }
        System.out.println("Brangiausias telefonas yra " +
                mobileArray[index].manufacturer + " " +
                mobileArray[index].model    );
    }
}
