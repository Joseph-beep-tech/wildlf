package models;

import java.sql.Timestamp;

public class Sightings {
    private String rangerName;
    private String location;
    private int wildlifeId;
    private int id;
    private Timestamp time;

    public Sightings(String rangerName, String location, int wildlifeId) {
        this.rangerName = rangerName;
        this.location = location;
        this.wildlifeId = wildlifeId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Timestamp getTime() {
        return time;
    }

    public String getRangerName() {
        return rangerName;
    }

    public void setRangerName(String rangerName) {
        this.rangerName = rangerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWildlifeId() {
        return wildlifeId;
    }

    public void setWildlifeId(int wildlifeId) {
        this.wildlifeId = wildlifeId;
    }
}
