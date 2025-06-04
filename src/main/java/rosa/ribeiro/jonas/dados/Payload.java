package rosa.ribeiro.jonas.dados;

public class Payload {
    private int repository_id;
    private int push_id;
    private Commit commits;

    public Payload() {
    }

    public int getRepository_id() {
        return repository_id;
    }

    public void setRepository_id(int repository_id) {
        this.repository_id = repository_id;
    }

    public int getPush_id() {
        return push_id;
    }

    public void setPush_id(int push_id) {
        this.push_id = push_id;
    }
}
