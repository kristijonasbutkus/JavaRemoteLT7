package HomeWork.HW2020.AstuntaDalis;

public class Main {



    public static void main(String[] args) {

        Poem poem1 = new Poem();
        Poem poem2 = new Poem();
        Poem poem3 = new Poem();


        poem1.creator.surname = "John Dzionysimo";
        poem1.creator.nationality = "Lietuvis";
        poem2.creator.surname = "Vladimir Xaduken";
        poem2.creator.nationality = "Rusas";

        String array[] = new String[4];

        array[0] = poem1.creator.surname;

    }

}


