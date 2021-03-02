package HomeWork.February15.Task6;

public class House {
    double houseArea;
    String district;
    int builtYear;
    String condition;

    public House (double houseArea, String district, int builtYear, String condition){
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;
    }

    public void getNewestBuiltYear(House[] array) {
        int tempYear = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].builtYear > tempYear) {
                tempYear = array[i].builtYear;
                index = i;
            }
        }
        System.out.println("Naujausias turimas namas pastatytas " + tempYear
            + " metais. jo plotas yra " + array[index].houseArea +
                " ");
    }
}
