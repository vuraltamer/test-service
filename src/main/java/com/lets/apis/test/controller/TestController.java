package com.lets.apis.test.controller;

import com.lets.apis.client.generator.model.ApiDetail;
import com.lets.apis.client.generator.util.ApiOperationUtil;
import com.lets.apis.client.generator.writer.FileWriter;
import com.lets.apis.test.model.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/test")
public class TestController {

    @PostMapping(value = "search")
    public String get(@RequestBody UserRequest searchRequest) {
        return "null";
    }

    @GetMapping(value = "{val}")
    public String getm(@PathVariable("val") String val) {
        return val;
    }

    public static void main(String[] args) {
        ApiDetail apiDetail = ApiOperationUtil.getApiDetail();
        FileWriter.write(apiDetail);
    }
}