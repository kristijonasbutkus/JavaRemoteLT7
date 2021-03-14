package design_patterns.singleton;

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        System.out.println("EnumSingleton");
        //do something
    }


    public static void main(String[] args) {
        EnumSingleton.INSTANCE.doSomething();
    }
}