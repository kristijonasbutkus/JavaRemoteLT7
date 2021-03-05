package HomeWork.February22.Task4;

public class Device {
    public String name;
    public double price;
    public double quantity;
    public String description;

    Device(String name, double price, double quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }
}