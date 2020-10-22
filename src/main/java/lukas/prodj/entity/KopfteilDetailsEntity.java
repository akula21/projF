package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "kopfteildetails")
public class KopfteilDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "kopfteildetails")
    private List<KopfteilEntity> kopfteil;

    @ManyToOne
    @JoinColumn(name = "produktgruppe3_id")
    private ProduktGruppe3Entity produktgruppe3;

    @Column(name = "bezeihnung")
    private String bezeihnung;

    @Column(name = "beschreibung")
    private String beschreibung;

    @Column(name = "etagenzahl")
    private int etagenZahl;

    @Column(name = "laenge")
    private double laeng;

    @Column(name = "hoehe")
    private double hoeh;

    @Column(name = "breite")
    private double breit;

    @Column(name = "preis")
    private double price;

    @Column(name = "bilder")
    private String bild;        // vstavit kartinku poka String'a

    @Column(name = "bezeihnungEN")
    private String bezeihnungEN;

    @Column(name = "bezeihnungRU")
    private String bezeihnungRU;

    @Column(name = "beschreibungEN")
    private String beschreibungEN;

    @Column(name = "beschreibungRU")
    private String beschreibungRU;

    @Column(name = "position")
    private String position;

    @Column(name = "kontbandantrieb")
    private boolean kontbandantrieb;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<KopfteilEntity> getKopfteil() {
        return kopfteil;
    }

    public void setKopfteil(List<KopfteilEntity> kopfteil) {
        this.kopfteil = kopfteil;
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

    public int getEtagenZahl() {
        return etagenZahl;
    }

    public void setEtagenZahl(int etagenZahl) {
        this.etagenZahl = etagenZahl;
    }

    public double getLaeng() {
        return laeng;
    }

    public void setLaeng(double laeng) {
        this.laeng = laeng;
    }

    public double getHoeh() {
        return hoeh;
    }

    public void setHoeh(double hoeh) {
        this.hoeh = hoeh;
    }

    public double getBreit() {
        return breit;
    }

    public void setBreit(double breit) {
        this.breit = breit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isKontbandantrieb() {
        return kontbandantrieb;
    }

    public void setKontbandantrieb(boolean kontbandantrieb) {
        this.kontbandantrieb = kontbandantrieb;
    }
}
