package design_patterns.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    //static block initialization for exception handling

    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    private StaticBlockSingleton(){}


    public static StaticBlockSingleton getInstance(){
        return instance;
    }

}
