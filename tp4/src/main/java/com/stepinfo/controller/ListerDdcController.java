package com.stepinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public abstract class ListerDdcController{
	
	@RequestMapping("/add/listerDdc")
    public String listDdc() {
        
        return "listerDdc";
    }
}

