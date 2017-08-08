package test.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "roaming_operators")
public class RoamingOperators {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    private Integer id;

    @Column(nullable = false)
    private Date date_operators = new Date();

    @Column(nullable = false)
    private String countries_operators;

    @Column(nullable = false)
    private Integer top_operators_in_countries;

    public RoamingOperators(){}

    public RoamingOperators(Date date_operators, String countries_operators, Integer top_operators_in_countries) {
        this.date_operators = date_operators;
        this.countries_operators = countries_operators;
        this.top_operators_in_countries = top_operators_in_countries;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_operators() {
        return date_operators;
    }

    public void setDate_operators(Date date_operators) {
        this.date_operators = date_operators;
    }

    public String getCountries_operators() {
        return countries_operators;
    }

    public void setCountries_operators(String countries_operators) {
        this.countries_operators = countries_operators;
    }

    public Integer getTop_operators_in_countries() {
        return top_operators_in_countries;
    }

    public void setTop_operators_in_countries(Integer top_operators_in_countries) {
        this.top_operators_in_countries = top_operators_in_countries;
    }

    @Override
    public String toString() {
        return "RoamingOperators{" +
                "id=" + id +
                ", date_operators=" + date_operators +
                ", countries_operators='" + countries_operators + '\'' +
                ", top_operators_in_countries=" + top_operators_in_countries +
                '}';
    }
}
