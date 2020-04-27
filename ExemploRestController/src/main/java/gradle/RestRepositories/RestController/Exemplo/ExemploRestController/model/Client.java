package gradle.RestRepositories.RestController.Exemplo.ExemploRestController.model;

/**
 * author: Willian Lopes da Silva
 * since:26/04/2002
 * version: 1.0
 */
public class Client {

    private String name;
    private String lastName;
    private String email;

    public Client() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
