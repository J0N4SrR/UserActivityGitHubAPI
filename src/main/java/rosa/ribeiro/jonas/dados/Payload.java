package rosa.ribeiro.jonas.dados;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true )
public class Payload {
    private int repository_id;
    private long push_id;
    private List<Commit> commits;

    public Payload(@JsonProperty("repository_id") int repository_id,
                   @JsonProperty("push_id") long push_id,
                   @JsonProperty("commits") List<Commit> commits) {
        this.repository_id = repository_id;
        this.push_id = push_id;
        this.commits = commits;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public long getPush_id() {
        return push_id;
    }

    public int getRepository_id() {
        return repository_id;
    }
}
