package com.limhaekyu.eco_rich_backend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "countries")
public class Countries {
    @Id
    @Column(name = "country_id")
    private char countryId;

    @Column(name = "country_name")
    private String countryName;

    // ManyToOne??
    @Column(name = "regions_id")
    private int regionId;
}
