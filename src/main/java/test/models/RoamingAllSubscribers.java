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
    private Date date_statistic = new Date();

    @Column(nullable = false)
    private Integer ourSubscribersInRoaming;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_statistic() {
        return date_statistic;
    }

    public void setDate_statistic(Date date_statistic) {
        this.date_statistic = date_statistic;
    }

    public Integer getOurSubscribersInRoaming() {
        return ourSubscribersInRoaming;
    }

    public void setOurSubscribersInRoaming(Integer ourSubscribersInRoaming) {
        this.ourSubscribersInRoaming = ourSubscribersInRoaming;
    }

    public RoamingAllSubscribers(){}

    public RoamingAllSubscribers(Date date_statistic, Integer ourSubscribersInRoaming) {
        this.date_statistic = date_statistic;
        this.ourSubscribersInRoaming = ourSubscribersInRoaming;
    }

    @Override
    public String toString() {
        return "RoamingAllSubsribers{" +
                "id=" + id +
                ", date_statistic=" + date_statistic +
                ", ourSubscribersInRoaming=" + ourSubscribersInRoaming +
                '}';
    }
}
