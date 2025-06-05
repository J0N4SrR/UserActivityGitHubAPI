package rosa.ribeiro.jonas.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Commit(String sha, Ator author, String message, boolean distinct, String url) {
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
}
