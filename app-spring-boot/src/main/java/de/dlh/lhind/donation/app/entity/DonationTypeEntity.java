package de.dlh.lhind.donation.app.entity;

import de.dlh.lhind.donation.app.enumeration.DonationTypeEnum;

import javax.persistence.*;

@Entity
@Table(name = "donation_type")
public class DonationTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated
    private DonationTypeEnum name;
}
