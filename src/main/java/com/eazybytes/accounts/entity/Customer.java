package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity //treat class a POJ representation
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEnity{

    @Id //This field is a primary key
    @GeneratedValue(strategy=GenerationType.IDENTITY) //auto generate primary key values
    @Column(name="customer_id")
    private Long customerId;

    private String name;
    private String email;

    @Column(name="mobile_number") //not needed as long as the var name matches schema.  This is just for info purposes only
    private String mobileNumber;
}
