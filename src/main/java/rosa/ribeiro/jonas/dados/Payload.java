package rosa.ribeiro.jonas.dados;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Payload(int repository_id, long push_id, List<Commit> commits) {
    public Payload(@JsonProperty("repository_id") int repository_id,
                   @JsonProperty("push_id") long push_id,
                   @JsonProperty("commits") List<Commit> commits) {
        this.repository_id = repository_id;
        this.push_id = push_id;
        this.commits = commits;
    }
}
