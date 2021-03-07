package HomeWork.February22.Task3;

public class Developer extends Person {

    protected int ageOfExperience;

    public Developer(String name, int ageOfExperience) {
        super(name);
        this.ageOfExperience = ageOfExperience;
        System.out.println("Developer constructor called.");
    }

    public void infoAbout (JavaDeveloper javaDeveloper) {
// ar nereiketu naudoti super kai kreipiames i child klase? vietoj javaDeveloper.name
        System.out.println("Programuotojo vardas: " + javaDeveloper.name);
        System.out.println("Patirtis: " + ageOfExperience + " metai.");
    }

}
