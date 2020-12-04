package models;

public class NonEndagered {
    private int id;
    private String animalName;

    public NonEndagered(String animalName) {
        this.animalName = animalName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
