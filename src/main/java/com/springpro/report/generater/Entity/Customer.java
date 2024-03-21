package com.springpro.report.generater.Entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@Table(name = "Customer_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;

    @Column(name = "NAME")
    private String customer_name;

    @Column(name="EMAIL_ID")
    private String email;

    @Column(name="PHONE_NUMBER")
    private BigInteger phone_number;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DESTINATION")
    private String to_des;

    @JsonFormat( shape=JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="D.O.B")
    private Date dob;








}
