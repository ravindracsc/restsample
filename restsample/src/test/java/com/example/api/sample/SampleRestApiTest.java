package com.example.api.sample;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;
import org.springframework.core.style.ToStringCreator;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ikeya on 15/06/24.
 */
public class SampleRestApiTest {
    @Test
    public void testSampleRestGet() {
        RestTemplate template = new RestTemplate();
        SampleResource response = template.getForObject("http://localhost:8080/restsample/api/v1/sample/{id}",
                SampleResource.class, 543);
        System.out.println(ToStringBuilder.reflectionToString(response));
    }

    @Test
    public void testSampleRestPost() {
        RestTemplate template = new RestTemplate();
        SampleResource request = new SampleResource();
        request.setNumber(234);
        request.setText("fuga");
        SampleResource response = template.postForObject("http://localhost:8080/restsample/api/v1/sample/",
                request, SampleResource.class);
        System.out.println(ToStringBuilder.reflectionToString(response));
    }
}
