package HomeWork.February22.Task4;

public class Company {
    protected String name;
    protected String address;
    protected ProductionType[] productionType;
    protected String device;

    Company (String name, String address, String productionType, String device){
        this.name = name;
        this.address = address;
        this.productionType = ProductionType.values();
        this.device = device;
    }


}
