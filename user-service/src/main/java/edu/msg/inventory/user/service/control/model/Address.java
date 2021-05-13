package edu.msg.inventory.user.service.control.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {

    private UUID id;

    private String postalCode;

    private String country;

    private String city;

    private String addressLine1;

    private String addressLine2;
}
