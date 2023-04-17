package com.limhaekyu.eco_rich_backend.service.impl;

import com.limhaekyu.eco_rich_backend.service.PublicDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class PublicDataServiceImpl implements PublicDataService{

    @Value("${public.data.url}")
    private String apiUrl;
    @Value("${public.data.service-key}")
    private String serviceKey;

    @Override
    public String getPublicData(Integer pageNo, Integer numOfRows, String prdlstNm) {
        String result = "";
        try {
            StringBuilder urlBuilder = new StringBuilder(apiUrl);
            urlBuilder.append("?").append(URLEncoder.encode("ServiceKey", StandardCharsets.UTF_8)).append("=").append(serviceKey);
            existPageNo(urlBuilder, pageNo);
            existNumOfRows(urlBuilder, numOfRows);
            existPrdlstNm(urlBuilder, prdlstNm);
            urlBuilder.append("&").append("type=json");

            /*
                URL 전송, GET 방식으로 데이터 받아오기
             */
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            BufferedReader br;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }

            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            conn.disconnect();
            result = sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private void existPrdlstNm(StringBuilder urlBuilder, String prdlstNm) {
        if(prdlstNm == null) {
            return;
        }
        urlBuilder.append("&").append(URLEncoder.encode("PRDLST_NM", StandardCharsets.UTF_8)).append("=").append(URLEncoder.encode(prdlstNm, StandardCharsets.UTF_8));
    }

    private void existNumOfRows(StringBuilder urlBuilder, Integer numOfRows) {
        if (numOfRows == null){
            urlBuilder.append("&").append(URLEncoder.encode("numOfRows", StandardCharsets.UTF_8)).append("=").append(URLEncoder.encode("10", StandardCharsets.UTF_8));
            return;
        }
        urlBuilder.append("&").append(URLEncoder.encode("numOfRows", StandardCharsets.UTF_8)).append("=").append(URLEncoder.encode(String.valueOf(numOfRows), StandardCharsets.UTF_8));
    }

    private void existPageNo(StringBuilder urlBuilder, Integer pageNo) {
        if (pageNo == null){
            urlBuilder.append("&").append(URLEncoder.encode("pageNo", StandardCharsets.UTF_8)).append("=").append(URLEncoder.encode("1", StandardCharsets.UTF_8));
            return;
        }
        urlBuilder.append("&").append(URLEncoder.encode("pageNo", StandardCharsets.UTF_8)).append("=").append(URLEncoder.encode(String.valueOf(pageNo), StandardCharsets.UTF_8));
    }

}
