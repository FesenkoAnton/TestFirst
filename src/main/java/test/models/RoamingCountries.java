package test.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "roaming_countries")
public class RoamingCountries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date date_countries = new Date();

    @Column(nullable = false, length = 50)
    private String country;

    @Column(nullable = false)
    private Integer total_top_10_countries;

    public RoamingCountries(){}

    public RoamingCountries(Date date_countries, String country, Integer total_top_10_countries) {
        this.date_countries = date_countries;
        this.country = country;
        this.total_top_10_countries = total_top_10_countries;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_countries() {
        return date_countries;
    }

    public void setDate_countries(Date date_countries) {
        this.date_countries = date_countries;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getTotal_top_10_countries() {
        return total_top_10_countries;
    }

    public void setTotal_top_10_countries(Integer total_top_10_countries) {
        this.total_top_10_countries = total_top_10_countries;
    }

    @Override
    public String toString() {
        return "RoamingCountries{" +
                "id=" + id +
                ", date_countries=" + date_countries +
                ", country='" + country + '\'' +
                ", total_top_10_countries=" + total_top_10_countries +
                '}';
    }
}
