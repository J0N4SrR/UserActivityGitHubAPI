package rosa.ribeiro.jonas.dados;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true )
public class Commit {
    private String sha;
    private Ator author;
    private String message;
    private boolean distinct;
    private String url;

    public Commit(@JsonProperty("sha") String sha,
                  @JsonProperty("author") Ator author,
                  @JsonProperty("message") String message,
                  @JsonProperty("distinct") boolean distinct,
                  @JsonProperty("url") String url) {
        this.sha = sha;
        this.author = author;
        this.message = message;
        this.distinct = distinct;
        this.url = url;
    }

    public String getSha() {
        return sha;
    }

    public Ator getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public String getUrl() {
        return url;
    }
}
