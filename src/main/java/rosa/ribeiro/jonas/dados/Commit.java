package rosa.ribeiro.jonas.dados;

public class Commit {
    private String sha;
    private Ator author;
    private String message;
    private boolean distinct;
    private String url;

    public Commit() {
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Ator getAuthor() {
        return author;
    }

    public void setAuthor(Ator author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
