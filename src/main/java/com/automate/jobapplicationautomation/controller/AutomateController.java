package com.automate.jobapplicationautomation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AutomateController {
    @PostMapping(value = "/user", consumes = "application/json")
//            consumes = {"multipart/form-data"})
    @ResponseBody
    public Object subitUserProfile(
            @RequestBody
                    Object payload
//            @RequestPart("properties") @Valid
//            ConnectionProperties properties,
//            @RequestPart("cv") @Valid @NotNull
//            @NotBlank MultipartFile file,
//            @RequestBody
//                    RequestBody body
    ) throws Exception {
//        if (body == null) {
//            throw new Exception("user null");
//        }

        System.out.println("test");
        return "<h1>thanks</h1>";

    }

}
