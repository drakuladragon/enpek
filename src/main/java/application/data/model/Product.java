package application.data.model;

import javax.persistence.*;

@Entity(name = "tbl_product")
public class Product {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @Column(name = "price")
    private String price;

    @Column(name = "intro")
    private String intro;

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Product() {

    }

    public Product(String id, String name, String url, String price, String intro) {

        this.id = id;
        this.name = name;
        this.url = url;
        this.price = price;
        this.intro = intro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
