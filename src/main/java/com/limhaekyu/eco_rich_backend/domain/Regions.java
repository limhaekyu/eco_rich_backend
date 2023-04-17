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
    @Column(name = "region_id")
    private Long regionId;

    @Column(name = "region_name")
    private String regionName;
}
