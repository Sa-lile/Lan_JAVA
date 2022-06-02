package classes;

/**
 *
 * @author Sachiyo
 */
public abstract class Person {

    protected String name;
    protected String firstName;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{name=").append(name);
        sb.append(", firstName=").append(firstName);
        sb.append('}');
        return sb.toString();
    }
    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public String getFirstName() {
        return firstName == null ? "" : name;
    }

    public Person() {
    }



}
