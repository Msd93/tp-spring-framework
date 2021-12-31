package com.stepinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListerDdcController {

   @RequestMapping(value = "/listerDdc")
   public ModelAndView dummy() {

      return new ModelAndView("listerDdc");
   }
}
