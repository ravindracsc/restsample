package com.example.api.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ikeya on 15/06/24.
 */
@RequestMapping("sample")
@RestController
public class SampleRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleRestController.class);

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public SampleResource postSample(@RequestBody SampleResource sample) {
        // omit
        sample.setId("123");
        LOGGER.info("POST: {}", sample);
        return sample;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    public SampleResource getSample(@PathVariable String id) {
        SampleResource sample = new SampleResource();
        sample.setId(id);
        sample.setNumber(123);
        sample.setText("hoge");
        LOGGER.info("GET: {}", sample);
        return sample;
    }
}
