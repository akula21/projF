package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "verkaufsartikeldetails")
public class VerkaufsArtikelDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "verkaufsartikeldetails")
    private List<VerkaufsArtikelEntity> verkaufsArtikel;

    @ManyToOne
    @JoinColumn(name = "produktgruppe_id")
    private ProduktGruppe2Entity produktgruppe2;

    @Column(name = "bezeihnung")
    private String bezeihnng;

    @Column(name = "beschreibung")
    private String beschrbng;

    @Column(name = "gewicht")
    private double gewicht;

    @Column(name = "preis")
    private double preis;

    // Bild Insert

    @Column(name = "bezeihnungEN")
    private String bezeihnungEN;

    @Column(name = "bezeihnungRU")
    private String bezeihnungRU;

    @Column(name = "beschreibungEN")
    private String beschreibungEN;

    @Column(name = "beschreibungRU")
    private String beschreibungRU;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<VerkaufsArtikelEntity> getVerkaufsArtikel() {
        return verkaufsArtikel;
    }

    public void setVerkaufsArtikel(List<VerkaufsArtikelEntity> verkaufsArtikel) {
        this.verkaufsArtikel = verkaufsArtikel;
    }

    public ProduktGruppe2Entity getProduktgruppe2() {
        return produktgruppe2;
    }

    public void setProduktgruppe2(ProduktGruppe2Entity produktgruppe2) {
        this.produktgruppe2 = produktgruppe2;
    }

    public String getBezeihnng() {
        return bezeihnng;
    }

    public void setBezeihnng(String bezeihnng) {
        this.bezeihnng = bezeihnng;
    }

    public String getBeschrbng() {
        return beschrbng;
    }

    public void setBeschrbng(String beschrbng) {
        this.beschrbng = beschrbng;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getBezeihnungEN() {
        return bezeihnungEN;
    }

    public void setBezeihnungEN(String bezeihnungEN) {
        this.bezeihnungEN = bezeihnungEN;
    }

    public String getBezeihnungRU() {
        return bezeihnungRU;
    }

    public void setBezeihnungRU(String bezeihnungRU) {
        this.bezeihnungRU = bezeihnungRU;
    }

    public String getBeschreibungEN() {
        return beschreibungEN;
    }

    public void setBeschreibungEN(String beschreibungEN) {
        this.beschreibungEN = beschreibungEN;
    }

    public String getBeschreibungRU() {
        return beschreibungRU;
    }

    public void setBeschreibungRU(String beschreibungRU) {
        this.beschreibungRU = beschreibungRU;
    }
}
