package de.dlh.lhind.donation.app.entity;

import de.dlh.lhind.donation.app.enumeration.RoleEnum;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated
    private RoleEnum roleName;
}
