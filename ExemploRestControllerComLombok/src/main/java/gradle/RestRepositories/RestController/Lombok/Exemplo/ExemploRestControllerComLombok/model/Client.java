package gradle.RestRepositories.RestController.Lombok.Exemplo.ExemploRestControllerComLombok.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Client {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String email;

}
