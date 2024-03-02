package store;

import store.models.Bread;
import store.models.Chocolate;
import store.models.Coke;
import store.models.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[6];
        products[0] = new Chocolate("Desert", 37.00, "Bitter with Orange Flavor", "dark" );
        products[1] = new Chocolate("Desert", 35.50, "Milk Chocolate", "brown" );
        products[2] = new Coke("Drink", 23.50, "CocaCola", true);
        products[3] = new Coke("Drink", 22.50, "CocaCola", false);
        products[4] = new Bread("Bakery", 32.99, "Village Bread", false);
        products[5] = new Bread("Bakery", 36.50, "Buckwheat Bread", true);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null){
            for (ProductForSale product : products){
                if (product != null){
                    product.showDetails();
                }
            }
        }

    }
}