package ru.Raingor.OnlineLibraryRest.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "user", schema = "online_library_rest")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "profile_picture_url")
    private String profilePicture;

    @Column(name = "name")
    private String username;

    @Column(name = "email")
    private String email;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;

    public User(String profilePicture, String username, String email) {
        this.profilePicture = profilePicture;
        this.username = username;
        this.email = email;
        this.role = Role.USER;
    }

    public User(String profilePicture, String username, String email, Role role) {
        this.profilePicture = profilePicture;
        this.username = username;
        this.email = email;
        this.role = role;
    }
}
