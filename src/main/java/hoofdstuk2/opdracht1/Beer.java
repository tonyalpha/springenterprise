package hoofdstuk2.opdracht1;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Beers")
public class Beer implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;

    @Column(name="Name")
    private String name;

    @Column(name="Price")
    private float price;

    @Column(name="Stock")
    private int stock;

    @Column(name="Alcohol")
    private float alcohol;

    @Version
    @Column(name="Version")
    private int version;

    @ManyToOne
    @JoinColumn(name="BrewerId")
    private Brewer brewer;

    @ManyToOne
    @JoinColumn(name="CategoryId")
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Brewer getBrewer() {
        return brewer;
    }

    public void setBrewer(Brewer brewer) {
        this.brewer = brewer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(name).append(" ").append(alcohol).append(" ");
        b.append(stock).append(" ").append(price).append(" ");
        return b.toString();
    }
}
