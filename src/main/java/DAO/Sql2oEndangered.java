package DAO;

import models.Endangered;

import java.util.List;

public interface Sql2oEndangered {

    List<Endangered> getAllEndangered();

    void addEndangeredAnimal(Endangered endangered);
}
