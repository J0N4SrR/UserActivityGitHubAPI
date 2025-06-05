package rosa.ribeiro.jonas.dados;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true )
public class GitData {
    private final String id;
    private final String type;
    private final Ator actor;
    private final Repo repo;
    private final Payload payload;
    @JsonProperty("public")
    private final boolean isPublic;
    private final String created_at;

    public GitData(@JsonProperty("id") String id,
                   @JsonProperty("type") String type,
                   @JsonProperty("actor") Ator actor,
                   @JsonProperty("repo") Repo repo,
                   @JsonProperty("payload") Payload payload,
                   @JsonProperty("public") boolean isPublic,
                   @JsonProperty("created_at") String created_at ) {
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
        return "Tipo de evento: " + type + " | ID: " + id + " | Autor: " + actor.getLogin() + "| Repositório: " + repo.getName();
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Ator getActor() {
        return actor;
    }

    public Repo getRepo() {
        return repo;
    }

    public Payload getPayload() {
        return payload;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public String getCreated_at() {
        return created_at;
    }
}
