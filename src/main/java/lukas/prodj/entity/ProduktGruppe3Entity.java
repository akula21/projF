package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "produktgruppe3")
public class ProduktGruppe3Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "produktgruppe3")
    private List<KopfteilDetailsEntity> kopfteilDetails;

    @OneToMany(mappedBy = "produktgruppe3")
    private List<ProduktGruppe4Entity> produktGruppe4;

    @OneToMany(mappedBy = "produktgruppe3")
    private List<KaefigDetailsEntity> kaefigDetails;

    @ManyToOne
    @JoinColumn(name = "produktgruppe2_id")
    private ProduktGruppe2Entity produktgruppe2;

    @Column(name = "produktgruppebezeihnungDE")
    private String produktgruppebezeihnungDE;

    @Column(name = "produktgruppebezeihnungEN")
    private String produktgruppebezeihnungEN;

    @Column(name = "produktgruppebezeihnungRU")
    private String produktgruppebezeihnungRU;

    @Column(name = "produktkurzname")
    private String prodKurzName;

    //vstavit kartinku

    @Column(name = "produktbeschreibung")
    private String prodBeschribung;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<KopfteilDetailsEntity> getKopfteilDetails() {
        return kopfteilDetails;
    }

    public void setKopfteilDetails(List<KopfteilDetailsEntity> kopfteilDetails) {
        this.kopfteilDetails = kopfteilDetails;
    }

    public List<ProduktGruppe4Entity> getProduktGruppe4() {
        return produktGruppe4;
    }

    public void setProduktGruppe4(List<ProduktGruppe4Entity> produktGruppe4) {
        this.produktGruppe4 = produktGruppe4;
    }

    public List<KaefigDetailsEntity> getKaefigDetails() {
        return kaefigDetails;
    }

    public void setKaefigDetails(List<KaefigDetailsEntity> kaefigDetails) {
        this.kaefigDetails = kaefigDetails;
    }

    public ProduktGruppe2Entity getProduktgruppe2() {
        return produktgruppe2;
    }

    public void setProduktgruppe2(ProduktGruppe2Entity produktgruppe2) {
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

    public String getProdBeschribung() {
        return prodBeschribung;
    }

    public void setProdBeschribung(String prodBeschribung) {
        this.prodBeschribung = prodBeschribung;
    }
}
