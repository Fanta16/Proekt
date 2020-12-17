package mk.ukim.finki.dians.eshop.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float latitude;
    private float longitude;
    private String name;
    private String address;
    @OneToMany(mappedBy="market")
    List<Product> products;

    public Market(float latitude, float longitude, String name, String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
    }

    public Market() {
    }

    public Long getId() {
        return id;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
