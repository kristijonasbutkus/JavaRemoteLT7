package advanced.enumerators;

public enum CarMaker {
    BMW("Bemsas", 1800),
    VOLVO("Volvakas", 1855),
    LEXUS("Lexiokas", 1900),
    AUDI("Audine", 2000);

    final String fullName;
    final int establishedIn;

    CarMaker (String fullName, int establishedIn){
        this.fullName = fullName;
        this.establishedIn = establishedIn;
    }
}
