package rosa.ribeiro.jonas.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GitData(String id, String type, Ator actor, Repo repo, Payload payload,
                      @JsonProperty("public") boolean isPublic, String created_at) {

    @Override
    public String toString() {
        return "Tipo de evento: " + type + " | ID: " + id + " | Autor: " + actor.login() + "| Repositório: " + repo.name();
    }

}
