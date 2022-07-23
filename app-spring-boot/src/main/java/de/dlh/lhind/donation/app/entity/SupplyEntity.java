package de.dlh.lhind.donation.app.entity;
import javax.persistence.*;

@Entity
@Table(name = "supply")
public class SupplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String supplyName;
}