package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "angebot")
public class AngebotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "angebot")
    private List<AngebotSystemDetailsEntity> angebotSystemDetails;

    @OneToMany(mappedBy = "angebot")
    private List<VerkaufsArtikelEntity> verkaufsArtikel;

    @OneToMany(mappedBy = "angebot")
    private List<KopfteilEntity> kopfTeil;

    @OneToMany(mappedBy = "angebot")
    private List<KaefigEntity> kaefig;

    @ManyToOne
    @JoinColumn(name = "kuden_id")
    private KundenStammEntity kundenStamm;

    @ManyToOne
    @JoinColumn(name = "mitarbeiter_id")
    private MitarbeiterEntity mitarbeiter;

    @ManyToOne
    @JoinColumn(name = "logo_id")
    private LogoEntity logo;

    @Column(name = "laender_id")
    private String laenderId;

    @Column(name = "angebotnummer")
    private int angebotNun;

    @Column(name = "beschreibung")
    private String beschreibung;

    @Column(name = "angebotsdatum")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate angDat;

    @Column(name = "lieferdatum")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate lieDat;

    @Column(name = "versandsdatum")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate verDat;

    @Column(name = "bestimmungsland_id")
    private long bestimlandId;

    @Column(name = "stalllange")
    private double stallnage;

    @Column(name = "stallbreite")
    private double stallbreite;

    @Column(name = "firsthohe")
    private double firsthohe;

    @Column(name = "traufenhohe")
    private double traufenhohe;

    @Column(name = "giebelFlfache")
    private double giebelFlache;

    @Column(name = "stallflache")
    private double stallFlache;

    @Column(name = "produktgruppe3_id")
    private long produktgruppe3Id;

    @Column(name = "tiergewicht")
    private double tierGewicht;

    //Cover bild insert


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AngebotSystemDetailsEntity> getAngebotSystemDetails() {
        return angebotSystemDetails;
    }

    public void setAngebotSystemDetails(List<AngebotSystemDetailsEntity> angebotSystemDetails) {
        this.angebotSystemDetails = angebotSystemDetails;
    }

    public List<VerkaufsArtikelEntity> getVerkaufsArtikel() {
        return verkaufsArtikel;
    }

    public void setVerkaufsArtikel(List<VerkaufsArtikelEntity> verkaufsArtikel) {
        this.verkaufsArtikel = verkaufsArtikel;
    }

    public List<KopfteilEntity> getKopfTeil() {
        return kopfTeil;
    }

    public void setKopfTeil(List<KopfteilEntity> kopfTeil) {
        this.kopfTeil = kopfTeil;
    }

    public List<KaefigEntity> getKaefig() {
        return kaefig;
    }

    public void setKaefig(List<KaefigEntity> kaefig) {
        this.kaefig = kaefig;
    }

    public KundenStammEntity getKundenStamm() {
        return kundenStamm;
    }

    public void setKundenStamm(KundenStammEntity kundenStamm) {
        this.kundenStamm = kundenStamm;
    }

    public MitarbeiterEntity getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(MitarbeiterEntity mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public LogoEntity getLogo() {
        return logo;
    }

    public void setLogo(LogoEntity logo) {
        this.logo = logo;
    }

    public String getLaenderId() {
        return laenderId;
    }

    public void setLaenderId(String laenderId) {
        this.laenderId = laenderId;
    }

    public int getAngebotNun() {
        return angebotNun;
    }

    public void setAngebotNun(int angebotNun) {
        this.angebotNun = angebotNun;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public LocalDate getAngDat() {
        return angDat;
    }

    public void setAngDat(LocalDate angDat) {
        this.angDat = angDat;
    }

    public LocalDate getLieDat() {
        return lieDat;
    }

    public void setLieDat(LocalDate lieDat) {
        this.lieDat = lieDat;
    }

    public LocalDate getVerDat() {
        return verDat;
    }

    public void setVerDat(LocalDate verDat) {
        this.verDat = verDat;
    }

    public long getBestimlandId() {
        return bestimlandId;
    }

    public void setBestimlandId(long bestimlandId) {
        this.bestimlandId = bestimlandId;
    }

    public double getStallnage() {
        return stallnage;
    }

    public void setStallnage(double stallnage) {
        this.stallnage = stallnage;
    }

    public double getStallbreite() {
        return stallbreite;
    }

    public void setStallbreite(double stallbreite) {
        this.stallbreite = stallbreite;
    }

    public double getFirsthohe() {
        return firsthohe;
    }

    public void setFirsthohe(double firsthohe) {
        this.firsthohe = firsthohe;
    }

    public double getTraufenhohe() {
        return traufenhohe;
    }

    public void setTraufenhohe(double traufenhohe) {
        this.traufenhohe = traufenhohe;
    }

    public double getGiebelFlache() {
        return giebelFlache;
    }

    public void setGiebelFlache(double giebelFlache) {
        this.giebelFlache = giebelFlache;
    }

    public double getStallFlache() {
        return stallFlache;
    }

    public void setStallFlache(double stallFlache) {
        this.stallFlache = stallFlache;
    }

    public long getProduktgruppe3Id() {
        return produktgruppe3Id;
    }

    public void setProduktgruppe3Id(long produktgruppe3Id) {
        this.produktgruppe3Id = produktgruppe3Id;
    }

    public double getTierGewicht() {
        return tierGewicht;
    }

    public void setTierGewicht(double tierGewicht) {
        this.tierGewicht = tierGewicht;
    }
}
