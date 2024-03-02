package store.models;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity * this.price;
    }

    public abstract void showDetails();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--------------------\n");
        stringBuilder.append("Type: " + getType() + "\n");
        stringBuilder.append("Price: " + getPrice() + "\n");
        stringBuilder.append("Description: " + getDescription() + "\n");
        return stringBuilder.toString();
        }


}
