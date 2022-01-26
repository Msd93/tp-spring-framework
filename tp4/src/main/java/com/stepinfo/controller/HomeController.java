package com.stepinfo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HomeController implements Controller {

   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
	   
       ModelAndView mv = new ModelAndView();
       mv.setViewName("home.jsp");
	return mv;
   }

}
