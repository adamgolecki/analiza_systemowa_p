package pl.edu.pwr.abis.domain;


import jakarta.persistence.OneToOne;

@Entity
@Getter
@Setter
public class WydarzenieMiejscowe extends InneWydarzenie {

    @OneToOne
    Adres miejsce;

}
