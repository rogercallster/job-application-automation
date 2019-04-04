package com.automate.jobapplicationautomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AutomateController {

//    @Autowired
//    public AutomateController(StorageService storageService) {
//        this.storageService = storageService;
//    }


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

    @PostMapping(value = "/upload")
    public void upload(@RequestParam("cv") MultipartFile file, @RequestParam("cover") MultipartFile cover,
            RedirectAttributes redirectAttributes){

        System.out.println(file);

//        storageService.store(file);
//        redirectAttributes.addFlashAttribute("message",
//                "You successfully uploaded " + file.getOriginalFilename() + "!");


    }


}
