package rosa.ribeiro.jonas.dados;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true )
public class GitData {
    private String id;
    private String type;
    private Ator actor;
    private Repo repo;
    private Payload payload;
    @JsonProperty("public")
    public boolean isPublic;
    private String created_at;

    public GitData() {
    }

    @Override
    public String toString() {
        return "Tipo de evento: " + type + " | ID: " + id + " | Autor: " + actor.getLogin() + "| Repositório: " + repo.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ator getActor() {
        return actor;
    }

    public void setActor(Ator actor) {
        this.actor = actor;
    }

    public Repo getRepo() {
        return repo;
    }

    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
