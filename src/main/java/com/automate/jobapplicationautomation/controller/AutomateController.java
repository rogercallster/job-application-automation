package com.automate.jobapplicationautomation.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AutomateController {
    @RequestMapping(value = "/user", method = RequestMethod.POST)
//            consumes = {"multipart/form-data"})
    @ResponseBody
    public void subitUserProfile(
//            @RequestPart("properties") @Valid
//            ConnectionProperties properties,
            @RequestPart("cv") @Valid @NotNull
            @NotBlank MultipartFile file,
            @RequestBody
                    RequestBody body) throws Exception {
        if (body == null) {
            throw new Exception("user null");
        }

    }

}
