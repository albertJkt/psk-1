package vu.lt.persistence;

import lombok.Setter;
import vu.lt.entities.Hotel;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ApplicationScoped
public class HotelsDAO {
    @PersistenceContext
    @Setter
    private  EntityManager em;

    public List<Hotel> loadAll() {
        return em.createNamedQuery("Hotels.findAll", Hotel.class).getResultList();
    }

    public Hotel findOne(int id) {
        return em.find(Hotel.class, id);
    }

    public void persist(Hotel hotel){
        this.em.persist(hotel);
    }
}
