package HomeWork.Task4;

import com.sun.istack.internal.NotNull;

public class Main {
    public static void main(String[] args) {

        Mobile[] mobileArray = new Mobile[3];

        mobileArray[0] = new Mobile("3310", "Nokia", 10);
        mobileArray[1] = new Mobile("CX65", "Samsung", 20);
        mobileArray[2] = new Mobile("1066D", "Alcatel", 15);

        Mobile.MaxpensiveMobile(mobileArray);
    }
}
