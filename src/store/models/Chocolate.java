package store.models;

public class Chocolate extends ProductForSale {
    private String color;

    public Chocolate(String type, double price, String description, String color) {
        super(type, price, description);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void showDetails() {
        System.out.println(
                super.toString() +
                "Chocolate Color: " + this.color + "\n");
    }
}
