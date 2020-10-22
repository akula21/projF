package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "kundenstamm")
public class KundenStammEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "kundenStamm")
    private List<AngebotEntity> angebot;

    @Column(name = "kundenNummer")
    private int kundenNummer;

    @Column(name = "kundenName")
    private String kundeName;

    @Column(name = "ansprechspartner")
    private String ansprechspartner;

    @Column(name = "adress")
    private String adress;

    @ManyToOne
    @JoinColumn(name = "laender_id")
    private LaenderEntity laender;

    @Column(name = "telNummer")
    private long telNum;

    @Column(name = "telFax")
    private long telFax;

    @Column(name = "mobil")
    private long mobil;

    @Column(name = "email")
    private String eMail;

    @Column(name = "internet")
    private String internet;

    @Column(name = "hinweis")
    private String hinweis;

    @Column(name = "rabat")
    private int rabat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AngebotEntity> getAngebot() {
        return angebot;
    }

    public void setAngebot(List<AngebotEntity> angebot) {
        this.angebot = angebot;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public String getKundeName() {
        return kundeName;
    }

    public void setKundeName(String kundeName) {
        this.kundeName = kundeName;
    }

    public String getAnsprechspartner() {
        return ansprechspartner;
    }

    public void setAnsprechspartner(String ansprechspartner) {
        this.ansprechspartner = ansprechspartner;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LaenderEntity getLaender() {
        return laender;
    }

    public void setLaender(LaenderEntity laender) {
        this.laender = laender;
    }

    public long getTelNum() {
        return telNum;
    }

    public void setTelNum(long telNum) {
        this.telNum = telNum;
    }

    public long getTelFax() {
        return telFax;
    }

    public void setTelFax(long telFax) {
        this.telFax = telFax;
    }

    public long getMobil() {
        return mobil;
    }

    public void setMobil(long mobil) {
        this.mobil = mobil;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getHinweis() {
        return hinweis;
    }

    public void setHinweis(String hinweis) {
        this.hinweis = hinweis;
    }

    public int getRabat() {
        return rabat;
    }

    public void setRabat(int rabat) {
        this.rabat = rabat;
    }
}
