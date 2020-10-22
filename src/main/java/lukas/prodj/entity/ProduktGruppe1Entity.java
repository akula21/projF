package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "produktgruppe1")
public class ProduktGruppe1Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "produktgruppe1")
    private List<ProduktGruppe2Entity> produktgruppe2;

    @Column(name = "produktgruppebezeihnungDE")
    private String produktgruppebezeihnungDE;

    @Column(name = "produktgruppebezeihnungEN")
    private String produktgruppebezeihnungEN;

    @Column(name = "produktgruppebezeihnungRU")
    private String produktgruppebezeihnungRU;

    //vstavit kartinku

    @Column(name = "produktkurzname")
    private String prodKurzName;

    @Column(name = "produktbeschreibung")
    private String produktBeschreibung;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ProduktGruppe2Entity> getProduktgruppe2() {
        return produktgruppe2;
    }

    public void setProduktgruppe2(List<ProduktGruppe2Entity> produktgruppe2) {
        this.produktgruppe2 = produktgruppe2;
    }

    public String getProduktgruppebezeihnungDE() {
        return produktgruppebezeihnungDE;
    }

    public void setProduktgruppebezeihnungDE(String produktgruppebezeihnungDE) {
        this.produktgruppebezeihnungDE = produktgruppebezeihnungDE;
    }

    public String getProduktgruppebezeihnungEN() {
        return produktgruppebezeihnungEN;
    }

    public void setProduktgruppebezeihnungEN(String produktgruppebezeihnungEN) {
        this.produktgruppebezeihnungEN = produktgruppebezeihnungEN;
    }

    public String getProduktgruppebezeihnungRU() {
        return produktgruppebezeihnungRU;
    }

    public void setProduktgruppebezeihnungRU(String produktgruppebezeihnungRU) {
        this.produktgruppebezeihnungRU = produktgruppebezeihnungRU;
    }

    public String getProdKurzName() {
        return prodKurzName;
    }

    public void setProdKurzName(String prodKurzName) {
        this.prodKurzName = prodKurzName;
    }

    public String getProduktBeschreibung() {
        return produktBeschreibung;
    }

    public void setProduktBeschreibung(String produktBeschreibung) {
        this.produktBeschreibung = produktBeschreibung;
    }
}
