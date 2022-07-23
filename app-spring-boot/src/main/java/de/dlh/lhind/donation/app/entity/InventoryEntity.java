package de.dlh.lhind.donation.app.entity;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "inventory")
public class InventoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ElementCollection
    @CollectionTable(name = "supply_quantity",
            joinColumns = {@JoinColumn(name = "supply_id", referencedColumnName = "id")})
    @MapKeyColumn(name = "quantity")
    @Column(name = "supply")
    private Map<SupplyEntity, Integer>supplies;
}
