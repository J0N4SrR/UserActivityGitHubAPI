package rosa.ribeiro.jonas.service;

public class GitData {
    private String id;
    private String type;

    public GitData() {
    }

    @Override
    public String toString() {
        return "GitData{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
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
}
