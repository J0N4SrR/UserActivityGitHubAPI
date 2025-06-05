package rosa.ribeiro.jonas.dados;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Ator(int id, String login, String display_login) {
    public Ator(@JsonProperty("id") int id,
                @JsonProperty("login") String login,
                @JsonProperty("display_login") String display_login) {

        this.id = id;
        this.login = login;
        this.display_login = display_login;
    }
}
