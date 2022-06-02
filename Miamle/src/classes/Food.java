package classes;

import enumerations.Dish;

/**
 *
 * @author Herbert
 */
public class Food {

    private Dish dish;
    private int qty;

    public Food(Dish dish, int qty) {
        this.dish = dish;
        this.qty = qty;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
