package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "kopfteil")
public class KopfteilEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "angebot_id")
    private AngebotEntity angebot;

    @ManyToOne
    @JoinColumn(name = "kopfteildetails_id")
    private KopfteilDetailsEntity kopfteildetails;

    @Column(name = "anzahl")
    private int anzahl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AngebotEntity getAngebot() {
        return angebot;
    }

    public void setAngebot(AngebotEntity angebot) {
        this.angebot = angebot;
    }

    public KopfteilDetailsEntity getKopfteildetails() {
        return kopfteildetails;
    }

    public void setKopfteildetails(KopfteilDetailsEntity kopfteildetails) {
        this.kopfteildetails = kopfteildetails;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
