package classes;

import enumerations.Dish;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sachiyo
 */
public class Participant extends Person implements Serializable  {

    private static final long serialVersionUID = 2L;

    private String phone;
    private int nbPersons;
    private String comment;
    private final Map<Dish, Integer> dishes;
//    Set<Dish> dishes = new HashSet<>(); // l'utilisation de Set sera plus compliquer

    public Participant() {
        dishes = new HashMap<>();
        phone = "          ";
        comment = " N/A ";
    }

    public Participant(String name, String firstName) {
        super(name, firstName);
        dishes = new HashMap<>();
        phone = "          ";
        comment = " N/A ";
    }

    public void addDish(Dish dish, int qty) {
        this.dishes.put(dish, qty);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNbPersons() {
        return nbPersons;
    }

    public void setNbPersons(int nbPersons) {
        this.nbPersons = nbPersons;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // countDishes sur la fichier de'évenement
    public Map<Dish, Integer> getDishes() {
        return dishes;
    }
    //1: Creer une constractor "getDishQuantity
//    public int getDishQuantity(Dish dish) {
//        return this.dishes.get(dish);
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Participant{phone=").append(phone);
        sb.append(", nbPersons=").append(nbPersons);
        sb.append(", remark=").append(comment);
        sb.append(", dishes=").append(dishes);
        sb.append('}');
        return sb.toString();
    }
 // Retourner une chaine pour l'affichage de l'évenement en console 
    public String consoleFormat() {
        StringBuilder sb = new StringBuilder("");
        sb.append(firstName).append(" ").append(name);
        sb.append("| ").append(phone);
        sb.append("\t| ").append(dishes.get(Dish.ENTREE));
        sb.append("\t | ").append(dishes.get(Dish.PLAT));
        sb.append("\t | ").append(dishes.get(Dish.DESSERT));
        sb.append("\t | ").append(dishes.get(Dish.BOISSON));
        sb.append("\t | ").append(nbPersons);
        sb.append("\t\t\t  | ").append(comment);
        return sb.toString();
    }

}
