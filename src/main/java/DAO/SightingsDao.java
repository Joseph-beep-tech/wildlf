package DAO;

import models.Sightings;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class SightingsDao implements Sql2oSightings{
    private final Sql2o sql2o;

    public SightingsDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public List<Sightings> getAllSightings() {
        String sql = "SELECT * FROM sightings";
        try (Connection con = sql2o.open ()){
            return con.createQuery ( sql )
                    .executeAndFetch ( Sightings.class );
        }catch (Sql2oException ex){
            System.out.println (ex);
            return null;
        }
    }

    @Override
    public void addSighting(Sightings sightings) {
        String sql = "INSERT INTO sightings (rangerName,location, wildlifeId, time) VALUES (:rangerName, :location, :wildlifeId, now())";
        try (Connection con = sql2o.open ()){
            int id = (int) con.createQuery ( sql )
                    .bind ( sightings )
                    .executeUpdate ()
                    .getKey ();
            sightings.setId(id);
        }catch (Sql2oException ex){
            System.out.println (ex);
        }

    }
}
