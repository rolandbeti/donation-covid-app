package de.dlh.lhind.donation.app.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Table(name = "donation")
@Entity
public class DonationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private DonationTypeEntity donationType;
    private int quantity;
}