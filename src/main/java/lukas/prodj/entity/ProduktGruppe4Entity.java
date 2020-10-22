package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "produktgruppe4")
public class ProduktGruppe4Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "produktgruppe3_id")
    private ProduktGruppe3Entity produktgruppe3;

    @Column(name = "produktgruppebezeihnungDE")
    private String produktgruppebezeihnungDE;

    @Column(name = "produktgruppebezeihnungEN")
    private String produktgruppebezeihnungEN;

    @Column(name = "produktgruppebezeihnungRU")
    private String produktgruppebezeihnungRU;

    @Column(name = "produktkurzname")
    private String prodKurzName;

    // Vstavit kartinku

    @Column(name = "produktbeschreibung")
    private String prodBeschreibung;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ProduktGruppe3Entity getProduktgruppe3() {
        return produktgruppe3;
    }

    public void setProduktgruppe3(ProduktGruppe3Entity produktgruppe3) {
        this.produktgruppe3 = produktgruppe3;
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

    public String getProdBeschreibung() {
        return prodBeschreibung;
    }

    public void setProdBeschreibung(String prodBeschreibung) {
        this.prodBeschreibung = prodBeschreibung;
    }
}
