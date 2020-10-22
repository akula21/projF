package lukas.prodj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "laender")
public class LaenderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "laender")
    private List<KundenStammEntity> kundenStamm;

    @Column(name = "landname")
    private String landName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<KundenStammEntity> getKundenStamm() {
        return kundenStamm;
    }

    public void setKundenStamm(List<KundenStammEntity> kundenStamm) {
        this.kundenStamm = kundenStamm;
    }

    public String getLandName() {
        return landName;
    }

    public void setLandName(String landName) {
        this.landName = landName;
    }
}
