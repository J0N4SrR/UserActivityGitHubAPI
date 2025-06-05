package rosa.ribeiro.jonas.dados;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true )
public class Repo {
    private int id;
    private String name;
    private String url;

    public Repo(@JsonProperty("id") int id,
                @JsonProperty("name") String name,
                @JsonProperty("url") String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
