package test.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "top_5_operators_in_ato")
public class Top5OperatorsInAto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    private Integer id;

    @Column(nullable = false)
    private Date date_5_operators = new Date();

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private Integer total_subscribers;

    public Top5OperatorsInAto(){}

    public Top5OperatorsInAto(Date date_5_operators, String name, Integer total_subscribers) {
        this.date_5_operators = date_5_operators;
        this.name = name;
        this.total_subscribers = total_subscribers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_5_operators() {
        return date_5_operators;
    }

    public void setDate_5_operators(Date date_5_operators) {
        this.date_5_operators = date_5_operators;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotal_subscribers() {
        return total_subscribers;
    }

    public void setTotal_subscribers(Integer total_subscribers) {
        this.total_subscribers = total_subscribers;
    }

    @Override
    public String toString() {
        return "Top5OperatorsInAto{" +
                "id=" + id +
                ", date_5_operators=" + date_5_operators +
                ", name='" + name + '\'' +
                ", total_subscribers=" + total_subscribers +
                '}';
    }
}
