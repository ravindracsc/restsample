package com.example.api.filesample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by ikeya on 15/06/24.
 *
 * http://stackoverflow.com/questions/21329426/spring-mvc-multipart-request-with-json
 */
@RequestMapping("filesample")
@RestController
public class FileSampleRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileSampleRestController.class);

    /**
     * Process posted file. The request is expected to consist of file only.
     * @param file1
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, params = "fileonly", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public FileSampleResource postFileSampleFileOnly(@RequestPart("file1") MultipartFile file1) {
        // omit
        LOGGER.info("POST file name: {}", file1.getOriginalFilename());
        try {
            LOGGER.info("POST file content: {}", new String(file1.getBytes(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileSampleResource sample = new FileSampleResource();
        sample.setId("123");
        sample.setNumber(123);
        sample.setText("hoge");
        LOGGER.info("POST: {}", sample);
        return sample;
    }

    /**
     * Process posted file. The request is expected to consist of files and json.
     * @param file1
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, params = "!fileonly", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public FileSampleResource postFileSample(@RequestPart("file1") MultipartFile file1,
                                             @RequestPart("request") FileSampleResource sample) {
        // omit
        LOGGER.info("POST file name: {}", file1.getOriginalFilename());
        try {
            LOGGER.info("POST file content: {}", new String(file1.getBytes(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        sample.setId("123");
        LOGGER.info("POST: {}", sample);
        return sample;
    }
}
