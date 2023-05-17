package entities;

public class Candidato {
    private String name;
    private int vote;

    public Candidato(String name, int vote) {
        this.name = name;
        this.vote = vote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidato candidato)) return false;

        return getName() != null ? getName().equals(candidato.getName()) : candidato.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return name + ": " + vote;
    }
}
