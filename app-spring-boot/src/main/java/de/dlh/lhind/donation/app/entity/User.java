package de.dlh.lhind.donation.app.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class User {
    private String firstName;
    private String lastName;
    private String idCardImageUrl;
    private Date birthDate;
    @ManyToOne
    private AddressEntity address;
    @OneToOne
    private AccountEntity account;
}
