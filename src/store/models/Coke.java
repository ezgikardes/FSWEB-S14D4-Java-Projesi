package store.models;

public class Coke extends ProductForSale {
    private boolean isLight;

    public Coke(String type, double price, String description, boolean isLight) {
        super(type, price, description);
        this.isLight = isLight;
    }

    public boolean isLight() {
        return isLight;
    }

    public void setLight(boolean light) {
        isLight = light;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        System.out.println(super.toString() + "Is Light: " + this.isLight + "\n");
    }
}
