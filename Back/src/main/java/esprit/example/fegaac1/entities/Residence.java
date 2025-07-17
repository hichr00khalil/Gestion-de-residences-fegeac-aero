package esprit.example.fegaac1.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Residence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_residence;

    private String nom;
    private int nombreBloc;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Bloc> blocs;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
