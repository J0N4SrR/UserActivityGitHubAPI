package rosa.ribeiro.jonas.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Repo(int id, String name, String url) {
    public Repo(@JsonProperty("id") int id,
                @JsonProperty("name") String name,
                @JsonProperty("url") String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }
}
