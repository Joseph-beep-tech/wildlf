package DAO;

import models.Sightings;

import java.util.List;

public interface Sql2oSightings {
    List<Sightings> getAllSightings();
    void addSighting(Sightings sightings);
}
