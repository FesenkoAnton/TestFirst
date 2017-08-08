package test.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "msc")
public class Post {

//@Entity
//@Table(name = "posts")
//public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name_msc;


    @Column(nullable = false)
    private Date date_statistic = new Date();

    @Column(nullable = false)
    private Integer own;

    @Column(nullable = false)
    private Integer roaming;

    @Column(nullable = false)
    private Integer total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_msc() {
        return name_msc;
    }

    public void setName_msc(String name_msc) {
        this.name_msc = name_msc;
    }

    public Integer getOwn() {
        return own;
    }

    public void setOwn(Integer own) {
        this.own = own;
    }

    public Integer getRoaming() {
        return roaming;
    }

    public void setRoaming(Integer roaming) {
        this.roaming = roaming;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Date getDate_statistic() {
        return date_statistic;
    }

    public void setDate_statistic(Date date_statistic) {
        this.date_statistic = date_statistic;
    }

    public Date getDate() {
        return date_statistic;
    }

    public void setDate(Date date) {
        this.date_statistic = date;
    }

    public Post() {}

    public Post(String name_msc, Date date_statistic, Integer own, Integer roaming, Integer total) {
        this.name_msc = name_msc;
        this.date_statistic = date_statistic;
        this.own = own;
        this.roaming = roaming;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name_msc='" + name_msc + '\'' +
                ", date_statistic=" + date_statistic +
                ", own=" + own +
                ", roaming=" + roaming +
                ", total=" + total +
                '}';
    }
}
