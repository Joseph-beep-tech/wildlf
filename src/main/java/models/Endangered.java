package models;

public class Endangered {
    private String animalName;
    private String health;
    private String age;
    private int id;

    public static final   String HEALTHY = "healthy";
    public static final  String OKAY = "okay";
    public static final String ILL = "ill";
    public static final  String NEWBORN = "newborn";
    public static final String YOUNG = "young";
    public static final String ADULT = "adult";

    private static final String DATABASE_TYPE = "endangered";

    public Endangered(String animalName, String type, String health, String age) {
        this.animalName = animalName;
        this.health = health;
        this.age = age;
        this.setType(DATABASE_TYPE);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void setType(String databaseType) {
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static String getDatabaseType() {
        return DATABASE_TYPE;
    }
}
