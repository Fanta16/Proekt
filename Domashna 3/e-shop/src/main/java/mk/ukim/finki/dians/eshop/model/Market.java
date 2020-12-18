package mk.ukim.finki.dians.eshop.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
    private  String imageUrl;

    public Market(Long id, float latitude, float longitude, String name, String address, List<Product> products, String imageUrl) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
        this.products = products;
        this.imageUrl = imageUrl;
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
