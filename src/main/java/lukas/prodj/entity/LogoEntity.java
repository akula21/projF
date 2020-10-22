package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "logo")
public class LogoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "logo")
    private List<AngebotEntity> angebot;

    @Column(name = "produktbezeihnung")
    private String produktbzh;

    @Column(name = "logobild")
    private String logobild;      // vstavit kartinku poka tut string'a

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<AngebotEntity> getAngebot() {
        return angebot;
    }

    public void setAngebot(List<AngebotEntity> angebot) {
        this.angebot = angebot;
    }

    public String getProduktbzh() {
        return produktbzh;
    }

    public void setProduktbzh(String produktbzh) {
        this.produktbzh = produktbzh;
    }

    public String getLogobild() {
        return logobild;
    }

    public void setLogobild(String logobild) {
        this.logobild = logobild;
    }
}
