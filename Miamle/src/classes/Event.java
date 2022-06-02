package classes;

import enumerations.Dish;
import java.io.Serializable;
import static java.lang.System.gc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sachiyo
 */
public class Event implements Serializable {

        private static final long serialVersionUID = 2L;

    // Une liste à cause des homonymes
    private List<Participant> participants;
    private LocalDate date;

    public Event() {
        this.participants = new ArrayList<>();
    }

    public Event(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    // Récupere Map

    private int countDish(Dish dish) {
        int counter = 0;
        for (Participant p : participants) {
            counter += p.getDishes().get(dish);
        }
        return counter;
    }

    // 1: counter entrees, plats, desserts
//    private int countDish(Dish dish) {
//        int counter = 0;
//        for (Participant p : participants) {
//            counter += p.getDishQuantity(dish);
//        }
//        return counter;
//}
    @Override
    public String toString() {
//    public String consoleFormat() {   // Soit avec consoleFormat et changer sur le main  
//   " System.out.println(anniv.consoleFormat());

        // Afficher la date, 
        // eol: end of line 
        String eol = System.lineSeparator();
        StringBuilder sb = new StringBuilder();
        //Création de la date au bon format de sortie   LLLL(Mois)= LONG
        String dateFormat = date.format(DateTimeFormatter.ofPattern("dd LLLL yyyy"));
        sb.append(dateFormat).append(eol);
        // le caractère '-'
        // J'ai réfrechi d'autre fonction...???? 
//        String separator = new String(new char[104]); 
//         System.out.println("-");
        String separator = new String(new char[104]).replace("\0", "-") + eol;
        sb.append(separator);  // La première separation

        sb.append("Nom\t\t| Téléphone\t| Entrée  | Plat | Dessert | Boisson | Nombre de participant | Remarque ");
        sb.append(eol);
        sb.append(separator); // Le 2ème  separation
        // Le boucle returne chacun participant.
        for (Participant p : participants) {
            sb.append(p.consoleFormat()).append(eol);
        }
        sb.append(separator); // Le 3ème  separation

        // Ajouter la dernière ligne avec les manques
        int nbParticipants = countParticipants();
//        sb.append("Manque\t\t| N/A\t\t|")
//                .append("countDish.Dish.ENTREE |")
//                .append(Dish.ENTREE)
//                .append(Dish.DESSERT)
//                .append(Dish.BOISSON)
//                .append("| N/A          | N/A ");
        sb.append("Manque\t\t| N/A\t\t|")
//                .append(Math.max(nbParticipants, nbParticipants) - countDish(Dish.ENTREE));
                .append(Math.max(nbParticipants- countDish(Dish.ENTREE), 0))
                .append("\t |")
                .append(Math.max(nbParticipants- countDish(Dish.PLAT), 0) )
                .append("\t |")
                .append(Math.max(nbParticipants- countDish(Dish.DESSERT), 0) )
                .append("\t | ")
                .append(Math.max(nbParticipants- countDish(Dish.BOISSON), 0) )
                .append("\t   |")
                .append(" N/A\t\t\t")
                .append("|N/A ");
        sb.append(eol);
        sb.append(separator); // Le 4ème  separation
        return sb.toString();
    }

    public void addParticipant(Participant p) {
        this.participants.add(p);
    }

    private int countParticipants() {
        int counter = 0;
        for (Participant p : participants) {
            counter += p.getNbPersons();
        }
        return counter;
    }
    
    public void save(String miamletxt) {
        
        // ouvrir le fichier en écriture texte
        // y insérer la date et un retour à la ligne
        // boucle sur les participants
        // insérer dans le fichier  une ligne par paticipant
        // en utilisant une méthode de Participant qui me retourne le
        //participant formatté pour la savegarde
    }

    public Event load(String miamletxt) {
        return null;
    }
}
