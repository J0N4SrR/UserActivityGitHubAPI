package rosa.ribeiro.jonas.dados;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true )
public class Payload {
    private int repository_id;
    private long push_id;
    private Commit commits;

    public Payload() {
    }

    public int getRepository_id() {
        return repository_id;
    }

    public void setRepository_id(int repository_id) {
        this.repository_id = repository_id;
    }

    public long getPush_id() {
        return push_id;
    }

    public void setPush_id(long push_id) {
        this.push_id = push_id;
    }
}
