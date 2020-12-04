package DAO;

import models.Endangered;
import models.NonEndagered;

import java.util.List;

public interface Sql2oNonEndangered {
    public List<NonEndagered> getAllNonEndangered();

    void addEndangeredAnimal(NonEndagered animal);
}
