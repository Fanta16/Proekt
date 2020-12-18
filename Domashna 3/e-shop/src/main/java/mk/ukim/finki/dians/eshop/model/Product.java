package mk.ukim.finki.dians.eshop.model;
import lombok.Data;
import jdk.jfr.DataAmount;

import javax.persistence.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private String name;
private Long price;

@ManyToOne
private Category category;

@ManyToOne
    private Market market;


    public Product(String name, Long price, Category category, Market market) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.market = market;
    }

    public Product() {

    }
}
