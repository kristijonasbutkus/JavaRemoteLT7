package HomeWork.February22.Task4;

import java.util.List;

public class Company {
    protected String name;
    protected String address;
    protected ProductionType productionType;
    protected List<Device> devices;

    Company (String name, String address, ProductionType productionType, List<Device> devices){
        this.name = name;
        this.address = address;
        this.productionType = productionType;
        this.devices = devices;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public String getAddress() {
        return address;
    }

    public ProductionType getProductionType() {
        return productionType;
    }

    public List<Device> getDevices() {
        return devices;
    }
}
