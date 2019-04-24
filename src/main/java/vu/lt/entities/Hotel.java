package vu.lt.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "HOTEL")
@Getter @Setter
@NamedQueries({
        @NamedQuery(name = "Hotels.findAll", query = "select h from Hotel as h")
})
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(max=50)
    @Column(name = "NAME")
    private String name;
    @Column(name = "ADDRESS")
    private String addres;
    @OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
    private List<Room> rooms;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(name, hotel.name) &&
                Objects.equals(addres, hotel.addres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addres);
    }
}
