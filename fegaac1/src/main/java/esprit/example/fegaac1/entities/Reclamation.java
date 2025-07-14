package esprit.example.fegaac1.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reclamation;

    private String description;
    private String titre;

    @Enumerated(EnumType.STRING)
    private ETAT_RECLAMATION etatReclamation;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
