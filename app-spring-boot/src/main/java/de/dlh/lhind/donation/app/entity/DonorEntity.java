package de.dlh.lhind.donation.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "donor")
public class DonorEntity extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}