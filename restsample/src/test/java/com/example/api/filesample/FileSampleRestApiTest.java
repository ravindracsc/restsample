package com.example.api.filesample;

import com.example.api.sample.SampleResource;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ikeya on 15/06/24.
 */
public class FileSampleRestApiTest {

    @Test
    public void testFileSampleRestPostFileOnly() {
        RestTemplate template = new RestTemplate();
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();

        Resource file1 = new ClassPathResource("/com/example/api/filesample/uploadtest.txt");
        parts.add("file1", file1);

        SampleResource response = template.postForObject("http://localhost:8080/restsample/api/v1/filesample?fileonly",
                parts, SampleResource.class);
        System.out.println(ToStringBuilder.reflectionToString(response));
    }

    @Test
    public void testFileSampleRestPostImplicitContentType() {
        RestTemplate template = new RestTemplate();
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();

        // for file
        Resource file1Resource = new ClassPathResource("/com/example/api/filesample/uploadtest.txt");
        parts.add("file1", file1Resource);

        // for json
        FileSampleResource request = new FileSampleResource();
        request.setNumber(213);
        request.setText("upload file with json");
        parts.add("request", request);

        SampleResource response = template.postForObject("http://localhost:8080/restsample/api/v1/filesample",
                parts, SampleResource.class);
        System.out.println(ToStringBuilder.reflectionToString(response));
    }

    @Test
    public void testFileSampleRestPost() {
        RestTemplate template = new RestTemplate();
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();

        // for file
        HttpHeaders file1Headers = new HttpHeaders();
        file1Headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        Resource file1Resource = new ClassPathResource("/com/example/api/filesample/uploadtest.txt");
        HttpEntity<Resource> file1 = new HttpEntity<>(file1Resource,file1Headers);
        parts.add("file1", file1);

        // for JSON
        FileSampleResource request = new FileSampleResource();
        request.setNumber(213);
        request.setText("upload file with json");

        HttpHeaders jsonHeaders = new HttpHeaders();
        jsonHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<FileSampleResource> json = new HttpEntity<>(request,jsonHeaders);
        parts.add("request", json);

        SampleResource response = template.postForObject("http://localhost:8080/restsample/api/v1/filesample",
                parts, SampleResource.class);
        System.out.println(ToStringBuilder.reflectionToString(response));
    }
}
