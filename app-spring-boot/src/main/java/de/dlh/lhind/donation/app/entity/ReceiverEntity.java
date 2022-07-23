package de.dlh.lhind.donation.app.entity;
import javax.persistence.*;

@Entity
@Table(name = "receiver")
public class ReceiverEntity extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String covidTestPdfUrl;
    private double monthlyIncome;
    private int familyMembersNo;
    @OneToOne
    private InventoryEntity inventory;
}