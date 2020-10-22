package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "kaefigdetails")
public class KaefigDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "kaefigdetails")
    private List<KaefigEntity> kaefig;

    @ManyToOne
    @JoinColumn(name = "produktgruppe3_id")
    private ProduktGruppe3Entity produktgruppe3;

    @Column(name = "bezeihnung")
    private String bezeihnung;

    @Column(name = "beschreibung")
    private String beschreibung;

    @Column(name = "kaefiglange")
    private double kaefigLange;

    @Column(name = "kaefighohe")
    private double kaefigHohe;

    @Column(name = "kaefigtiefe")
    private double kaefigTiefe;

    @Column(name = "sectionlange")
    private double sectionLange;

    @Column(name = "sectionhohe")
    private double sectionHohe;

    @Column(name = "sectionbreiteohnetrog")
    private double sectionBOT;

    @Column(name = "sectionbreitmittrog")
    private double sectionMT;

    @Column(name = "anzahlderlangstrennungen")
    private int anzahlDerLangstrennungen;

    @Column(name = "preiskaefig")
    private double priceKaefig;

    @Column(name = "etagenzahl")
    private int etagenZahl;

    // Bild insertion

    @Column(name = "kaefigflache")
    private double kaefigFlache;

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

    public List<KaefigEntity> getKaefig() {
        return kaefig;
    }

    public void setKaefig(List<KaefigEntity> kaefig) {
        this.kaefig = kaefig;
    }

    public ProduktGruppe3Entity getProduktgruppe3() {
        return produktgruppe3;
    }

    public void setProduktgruppe3(ProduktGruppe3Entity produktgruppe3) {
        this.produktgruppe3 = produktgruppe3;
    }

    public String getBezeihnung() {
        return bezeihnung;
    }

    public void setBezeihnung(String bezeihnung) {
        this.bezeihnung = bezeihnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getKaefigLange() {
        return kaefigLange;
    }

    public void setKaefigLange(double kaefigLange) {
        this.kaefigLange = kaefigLange;
    }

    public double getKaefigHohe() {
        return kaefigHohe;
    }

    public void setKaefigHohe(double kaefigHohe) {
        this.kaefigHohe = kaefigHohe;
    }

    public double getKaefigTiefe() {
        return kaefigTiefe;
    }

    public void setKaefigTiefe(double kaefigTiefe) {
        this.kaefigTiefe = kaefigTiefe;
    }

    public double getSectionLange() {
        return sectionLange;
    }

    public void setSectionLange(double sectionLange) {
        this.sectionLange = sectionLange;
    }

    public double getSectionHohe() {
        return sectionHohe;
    }

    public void setSectionHohe(double sectionHohe) {
        this.sectionHohe = sectionHohe;
    }

    public double getSectionBOT() {
        return sectionBOT;
    }

    public void setSectionBOT(double sectionBOT) {
        this.sectionBOT = sectionBOT;
    }

    public double getSectionMT() {
        return sectionMT;
    }

    public void setSectionMT(double sectionMT) {
        this.sectionMT = sectionMT;
    }

    public int getAnzahlDerLangstrennungen() {
        return anzahlDerLangstrennungen;
    }

    public void setAnzahlDerLangstrennungen(int anzahlDerLangstrennungen) {
        this.anzahlDerLangstrennungen = anzahlDerLangstrennungen;
    }

    public double getPriceKaefig() {
        return priceKaefig;
    }

    public void setPriceKaefig(double priceKaefig) {
        this.priceKaefig = priceKaefig;
    }

    public int getEtagenZahl() {
        return etagenZahl;
    }

    public void setEtagenZahl(int etagenZahl) {
        this.etagenZahl = etagenZahl;
    }

    public double getKaefigFlache() {
        return kaefigFlache;
    }

    public void setKaefigFlache(double kaefigFlache) {
        this.kaefigFlache = kaefigFlache;
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
