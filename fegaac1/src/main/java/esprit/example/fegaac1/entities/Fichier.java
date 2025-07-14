package esprit.example.fegaac1.entities;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fichier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fichier;

    @Enumerated(EnumType.STRING)
    private TYPE_FICHIER typeFichier;

    private String titre;
    private LocalDate dateCreation;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}