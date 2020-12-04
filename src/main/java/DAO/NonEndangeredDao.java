package DAO;

import models.Endangered;
import models.NonEndagered;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class NonEndangeredDao implements Sql2oNonEndangered{

    private final String DATABASE_TYPE = "animal";

    private final Sql2o sql2o;

    public NonEndangeredDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }


    @Override
    public List<NonEndagered> getAllNonEndangered() {
        String sql = "SELECT * FROM animals WHERE type='animal'";
        try (Connection con = sql2o.open ()) {
            return con.createQuery ( sql )
                    .throwOnMappingFailure ( false )
                    .executeAndFetch ( NonEndagered.class );

        } catch (Sql2oException ex) {
            System.out.println ( ex );
            return null;
        }
    }

    @Override
    public void addEndangeredAnimal(NonEndagered animal) {
        String sql = "INSERT INTO animals(animalName, type) VALUES (:animalName, :type)";
        try (Connection con = sql2o.open ()) {
            int id = (int) con.createQuery ( sql )
                    .throwOnMappingFailure ( false )
                    .bind ( animal )
                    .executeUpdate ()
                    .getKey();
            animal.setId ( id );

        } catch (Sql2oException ex) {
            System.out.println ( ex );
        }
    }
}
