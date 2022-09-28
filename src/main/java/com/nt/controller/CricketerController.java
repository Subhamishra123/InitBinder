package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Cricketer;
import com.nt.service.ICricketMgmtService;

@Controller
public class CricketerController {
	@Autowired
	private ICricketMgmtService service;
	
	@GetMapping("/")
	public String showHome()
	{
		return "home";
	}
	@GetMapping("/register")
	public String showRegister(@ModelAttribute("cricketer")Cricketer cricketer)
	{
		return "register";
	}
	
	@PostMapping("/register")
	public String processRegister(@ModelAttribute("cricketer")Cricketer cricketer,
			BindingResult errors
			,Map<String, Object>map
			)
	{
		String stringId = service.saveCricketer(cricketer);
		map.put("result", stringId);
		return "result";
	}
	
	@InitBinder
	public void customBinder(WebDataBinder binder)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor=new CustomDateEditor(sdf, false);
		binder.registerCustomEditor(java.util.Date.class, editor);
	}

}
