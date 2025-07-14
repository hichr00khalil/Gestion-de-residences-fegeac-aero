package esprit.example.fegaac1.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "app_user")  // ✅ FIX: avoids conflict with SQL Server reserved word
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String emailTelOrTelephone;

    @Enumerated(EnumType.STRING)
    private USER_ROLE user_role;

    private String adressegps;

    @OneToMany(mappedBy = "user")
    private List<Acess> accesses;

    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "user")
    private List<Paiment> paiements;

    @OneToMany(mappedBy = "user")
    private List<Pays> pays;

    @OneToMany(mappedBy = "user")
    private List<Residence> residences;

    @OneToMany(mappedBy = "user")
    private List<Bloc> blocs;

    @OneToMany(mappedBy = "user")
    private List<Appartement> appartements;

    @OneToMany(mappedBy = "user")
    private List<Fichier> fichiers;

    @OneToMany(mappedBy = "user")
    private List<Maintenance> maintenances;

    @OneToMany(mappedBy = "user")
    private List<Reclamation> reclamations;

    @OneToMany(mappedBy = "user")
    private List<Chat> chats;

    @OneToMany(mappedBy = "user")
    private List<Reponse> responses;
}
