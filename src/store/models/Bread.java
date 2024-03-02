package store.models;

public class Bread extends ProductForSale {
    private boolean isGlutenFree;

    public Bread(String type, double price, String description, boolean isGlutenFree) {
        super(type, price, description);
        this.isGlutenFree = isGlutenFree;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + "Is Gluten Free: " + this.isGlutenFree + "\n");
    }
}
