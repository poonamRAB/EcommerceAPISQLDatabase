package com.geekster.EcommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    private String addressName;

    private String addressLandmark;

    private String addressPhoneNumber;

    private String addressZipCode;

    private String state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_userId")
    private User user;
}
