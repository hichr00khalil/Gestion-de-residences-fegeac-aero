package esprit.example.fegaac1.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_country;

    private String pays;
    private String education;
    private String adresse;
    private String ville;
    private String localisation;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
