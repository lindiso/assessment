package com.lindiso.assessment.controller;

import com.lindiso.assessment.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("assessment")
@RestController
public class RestAssessmentController {

     private TemplateService templateService;

     @Autowired
     public RestAssessmentController(TemplateService templateService){
         this.templateService = templateService;
     }

    @RequestMapping(value = "/template/method")
    public float getTemplateMethod(@RequestParam("kelvin") float kelvin){
        if (templateService != null){
            return templateService.templateMethod(kelvin);
        }
        return  new Float(0);
    }




}
