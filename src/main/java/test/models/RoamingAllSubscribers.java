package test.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "roaming_all_subscribers")
public class RoamingAllSubscribers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date date_all = new Date();

    @Column(nullable = false)
    private Integer our_subsribers_in_roaming;

    public RoamingAllSubscribers(){}

    public RoamingAllSubscribers(Date date_all, Integer our_subsribers_in_roaming) {
        this.date_all = date_all;
        this.our_subsribers_in_roaming = our_subsribers_in_roaming;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_all() {
        return date_all;
    }

    public void setDate_all(Date date_all) {
        this.date_all = date_all;
    }

    public Integer getOur_subsribers_in_roaming() {
        return our_subsribers_in_roaming;
    }

    public void setOur_subsribers_in_roaming(Integer our_subsribers_in_roaming) {
        this.our_subsribers_in_roaming = our_subsribers_in_roaming;
    }

    @Override
    public String toString() {
        return "RoamingAllSubscribers{" +
                "id=" + id +
                ", date_all=" + date_all +
                ", our_subsribers_in_roaming=" + our_subsribers_in_roaming +
                '}';
    }
}
