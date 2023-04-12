package com.limhaekyu.eco_rich_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class LocationInfoDto {
    private int locationId;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String stateProvince;

    private char countryId;
    private String countryName;
    private int region_id;
    private String regionName;
}
