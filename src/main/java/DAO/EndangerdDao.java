package DAO;

import models.Endangered;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;


import java.sql.SQLException;
import java.util.List;

public class EndangerdDao implements Sql2oEndangered{

    private final Sql2o sql2o;

    public EndangerdDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }


    @Override
    public List<Endangered> getAllEndangered() {
        String sql = "SELECT * FROM animals WHERE type='endangered'";
        try (Connection con = sql2o.open ()) {
            return con.createQuery ( sql )
                    .throwOnMappingFailure ( false )
                    .executeAndFetch ( Endangered.class );

        } catch (Sql2oException ex) {
            System.out.println ( ex );
            return null;
        }
    }

    @Override
    public void addEndangeredAnimal(Endangered animal) {
        String sql = "INSERT INTO animals(animalName, age, health, type) VALUES (:animalName, :age, :health, :type)";
        try (Connection con = sql2o.open ()) {
            int id = (int) con.createQuery ( sql )
                     .bind ( animal )
                     .executeUpdate ()
                     .getKey();
             animal.setId ( id );

        } catch (Sql2oException ex) {
            System.out.println ( ex );
        }
    }
}
