package mk.ukim.finki.dians.eshop.model;
import lombok.Data;
import jdk.jfr.DataAmount;

import javax.persistence.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
private String name;
private Long price;

@OneToMany
private Category category;





}
