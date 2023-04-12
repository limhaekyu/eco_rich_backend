package com.limhaekyu.eco_rich_backend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "regions")
public class Regions {
    @Id
    @Column(name = "regions_id")
    private int regionId;

    @Column(name = "regions_name")
    private String region_name;
}
