package miamle;

import classes.Event;
import classes.Participant;
import enumerations.Dish;
import java.time.LocalDate;

/**
 *
 * @author Sachiyo
 */
public class Miamle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Afficher de DATE *
         */
        Event anniv = new Event();
        LocalDate d = LocalDate.of(2022, 9, 10);
        anniv.setDate(d);
//        System.out.println(anniv);

        /**
         * Créer 2 participants : herbert et alf *
         */
        Participant herbert = new Participant("Caffarel", "Herbert");
        Participant alf = new Participant("Danlta", "Alphonse");
//        participant.forEach(System.out::println); // ???
//        System.out.println(herbert);
//        System.out.println(alf);

        /**
         * Ajouter ces deux personnes à l'événement *
         */
        anniv.addParticipant(alf);
        anniv.addParticipant(herbert);
//        anniv.addParticipant(new Participant());

        /**
         * Ajouter les plats amenés par ces deux personnes à leur liste de
         * plats*
         */
        herbert.addDish(Dish.ENTREE, 2);
        herbert.addDish(Dish.PLAT, 2);
        herbert.addDish(Dish.DESSERT, 2);
        herbert.addDish(Dish.BOISSON, 2);
        herbert.setNbPersons(2);

        alf.addDish(Dish.ENTREE, 5);
        alf.addDish(Dish.PLAT, 5);
        alf.addDish(Dish.DESSERT, 3);
        alf.addDish(Dish.BOISSON, 1);
        alf.setNbPersons(3);
        alf.setComment("Gourmands");

        /**
         * Créer un événement *
         */
        // je ne peux pas avancer avec ce code...
//        for (Participant p : anniv.getParticipants()) {
//            for (Map.Entry food : p.getDishes().entrySet()) {
//                System.out.println(food.getKey() + " " + food.getValue());
//            }
//        }
//          Afficher tous les infos   : anniv.consoleFormat() ça ne fonction pas
//           System.out.println(anniv.consoleFormat());
        System.out.println(anniv.toString());
        
        // Sauvegarder l'évenement
        anniv.save("miamle.txt");
        
        // Récupérer l'évenement dans un autre objet
//        Event e = Event.load("miamle.txt");
        // On l'affiche pour voir si c'est la même
        System.out.println("");

    }
}
