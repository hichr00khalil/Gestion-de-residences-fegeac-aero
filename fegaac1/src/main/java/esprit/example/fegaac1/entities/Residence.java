package esprit.example.fegaac1.entities;


import jakarta.persistence.*;
import lombok.*;

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

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
