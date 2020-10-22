package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "verkaufsartikel")
public class VerkaufsArtikelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "verkaufsartickeldetails_id")
    private VerkaufsArtikelDetailsEntity verkaufsartikeldetails;

    @Column(name = "anzahl")
    private int anzahl;

    @ManyToOne
    @JoinColumn(name = "angebot_id")
    private AngebotEntity angebot;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public VerkaufsArtikelDetailsEntity getVerkaufsartikeldetails() {
        return verkaufsartikeldetails;
    }

    public void setVerkaufsartikeldetails(VerkaufsArtikelDetailsEntity verkaufsartikeldetails) {
        this.verkaufsartikeldetails = verkaufsartikeldetails;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public AngebotEntity getAngebot() {
        return angebot;
    }

    public void setAngebot(AngebotEntity angebot) {
        this.angebot = angebot;
    }
}
