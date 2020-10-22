package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "angebotsystemdetails")
public class AngebotSystemDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "angebot_id")
    private AngebotEntity angebot;

    @Column(name = "anzahlstalle")
    private int anzStalle;

    @Column(name = "gesamtpreis")
    private double gesPreis;

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

    public int getAnzStalle() {
        return anzStalle;
    }

    public void setAnzStalle(int anzStalle) {
        this.anzStalle = anzStalle;
    }

    public double getGesPreis() {
        return gesPreis;
    }

    public void setGesPreis(double gesPreis) {
        this.gesPreis = gesPreis;
    }
}
