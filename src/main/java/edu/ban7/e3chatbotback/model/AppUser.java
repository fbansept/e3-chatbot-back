package edu.ban7.e3chatbotback.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AppUser {
    
    public interface OnUpdate {}
    public interface OnCreate {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    @Email(groups = {OnCreate.class, OnUpdate.class})
    @NotBlank(groups = {OnCreate.class, OnUpdate.class})
    private String email;

    @Column(nullable = false)
    @NotBlank(groups = {OnCreate.class})
    private String password;

    @Column(nullable = false)
    @NotBlank(groups = {OnCreate.class, OnUpdate.class})
    private String pseudo;
}
