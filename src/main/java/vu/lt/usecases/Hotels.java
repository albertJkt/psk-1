package vu.lt.usecases;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import vu.lt.entities.Hotel;
import vu.lt.persistence.HotelsDAO;

@Model
public class Hotels implements Serializable {

    @Inject
    private HotelsDAO hotelsDAO;

    @Getter @Setter
    private Hotel hotelToCreate = new Hotel();

    @Getter
    private List<Hotel> allHotels;

    @PostConstruct
    public void init(){
        loadHotels();
    }

    public void loadHotels() {
        this.allHotels = hotelsDAO.loadAll();
    }

    @Transactional
    public String createHotel(){
        this.hotelsDAO.persist(hotelToCreate);
        return "success";
    }
}
