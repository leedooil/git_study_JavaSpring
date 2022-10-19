package com.spring.pro29.ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.pro29.HomeController;

@Controller
public class ResController {
	@RequestMapping(value = "/res1")
	@ResponseBody
	public Map<String, Object> res1() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "hong");
		map.put("name", "홍길동");
		return map;
	}
	
	@RequestMapping(value = "/res2")
	public ModelAndView res2() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
}















