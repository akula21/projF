package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "produktgruppe2")
public class ProduktGruppe2Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "produktgruppe2")
    private List<VerkaufsArtikelDetailsEntity> verkaufsArtikelDetails;

    @OneToMany(mappedBy = "produktgruppe2")
    private List<ProduktGruppe3Entity> produktGruppe3;

    @ManyToOne
    @JoinColumn(name = "produktgruppe1_id")
    private ProduktGruppe1Entity produktgruppe1;

    @Column(name = "produktgruppebezeihnungDE")
    private String produktgruppebezeihnungDE;

    @Column(name = "produktgruppebezeihnungEN")
    private String produktgruppebezeihnungEN;

    @Column(name = "produktgruppebezeihnungRU")
    private String produktgruppebezeihnungRU;

    @Column(name = "produktkurzname")
    private String prodKurzName;

    //Vstavit kartinku

    @Column(name = "produktbeschreibung")
    private String prodBeschreibung;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<VerkaufsArtikelDetailsEntity> getVerkaufsArtikelDetails() {
        return verkaufsArtikelDetails;
    }

    public void setVerkaufsArtikelDetails(List<VerkaufsArtikelDetailsEntity> verkaufsArtikelDetails) {
        this.verkaufsArtikelDetails = verkaufsArtikelDetails;
    }

    public List<ProduktGruppe3Entity> getProduktGruppe3() {
        return produktGruppe3;
    }

    public void setProduktGruppe3(List<ProduktGruppe3Entity> produktGruppe3) {
        this.produktGruppe3 = produktGruppe3;
    }

    public ProduktGruppe1Entity getProduktgruppe1() {
        return produktgruppe1;
    }

    public void setProduktgruppe1(ProduktGruppe1Entity produktgruppe1) {
        this.produktgruppe1 = produktgruppe1;
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
