package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "kaefig")
public class KaefigEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "kaefigdetails_id")
    private KaefigDetailsEntity kaefigdetails;

    @Column(name = "anzahlreihen")
    private int anzReihen;

    @Column(name = "anzahletagen")
    private int anzEtagen;

    @Column(name = "anzahlkaefigelinie")
    private int anzKaefigeLinie;

    @ManyToOne
    @JoinColumn(name = "angebot_id")
    private AngebotEntity angebot;

    @Column(name = "anzahltiereprokaefigeinstallen")
    private int anzTPKE;

    @Column(name = "anzahltiereprokaefigausstallen")
    private int anzTPKA;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public KaefigDetailsEntity getKaefigdetails() {
        return kaefigdetails;
    }

    public void setKaefigdetails(KaefigDetailsEntity kaefigdetails) {
        this.kaefigdetails = kaefigdetails;
    }

    public int getAnzReihen() {
        return anzReihen;
    }

    public void setAnzReihen(int anzReihen) {
        this.anzReihen = anzReihen;
    }

    public int getAnzEtagen() {
        return anzEtagen;
    }

    public void setAnzEtagen(int anzEtagen) {
        this.anzEtagen = anzEtagen;
    }

    public int getAnzKaefigeLinie() {
        return anzKaefigeLinie;
    }

    public void setAnzKaefigeLinie(int anzKaefigeLinie) {
        this.anzKaefigeLinie = anzKaefigeLinie;
    }

    public AngebotEntity getAngebot() {
        return angebot;
    }

    public void setAngebot(AngebotEntity angebot) {
        this.angebot = angebot;
    }

    public int getAnzTPKE() {
        return anzTPKE;
    }

    public void setAnzTPKE(int anzTPKE) {
        this.anzTPKE = anzTPKE;
    }

    public int getAnzTPKA() {
        return anzTPKA;
    }

    public void setAnzTPKA(int anzTPKA) {
        this.anzTPKA = anzTPKA;
    }
}
