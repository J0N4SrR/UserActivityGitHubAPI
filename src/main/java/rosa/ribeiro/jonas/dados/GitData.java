package rosa.ribeiro.jonas.dados;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GitData(String id, String type, Ator actor, Repo repo, Payload payload,
                      @JsonProperty("public") boolean isPublic, String created_at) {
    public GitData(@JsonProperty("id") String id,
                   @JsonProperty("type") String type,
                   @JsonProperty("actor") Ator actor,
                   @JsonProperty("repo") Repo repo,
                   @JsonProperty("payload") Payload payload,
                   @JsonProperty("public") boolean isPublic,
                   @JsonProperty("created_at") String created_at) {
        this.id = id;
        this.type = type;
        this.actor = actor;
        this.repo = repo;
        this.payload = payload;
        this.isPublic = isPublic;
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Tipo de evento: " + type + " | ID: " + id + " | Autor: " + actor.login() + "| Repositório: " + repo.name();
    }

    @Override
    public boolean isPublic() {
        return isPublic;
    }
}
