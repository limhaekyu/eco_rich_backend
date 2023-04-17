package com.limhaekyu.eco_rich_backend.controller;

import com.limhaekyu.eco_rich_backend.service.PublicDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/public")
public class PublicDataController {

    private final PublicDataService publicDataService;

    @GetMapping("")
    public ResponseEntity<String> selectPublicData(@RequestParam(value = "page-no", required = false) Integer pageNo, @RequestParam(value = "num-of-rows", required = false) Integer numOfRows,
                                                   @RequestParam(value = "PRDLST_NM", required = false) String prdlstNm) {
        String publicData = publicDataService.getPublicData(pageNo, numOfRows, prdlstNm);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_TYPE, "application/json;charset=UTF-8").body(publicData);
    }
}
